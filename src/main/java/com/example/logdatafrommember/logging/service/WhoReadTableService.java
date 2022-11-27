package com.example.logdatafrommember.logging.service;

import com.example.logdatafrommember.logging.dto.hasAddedUser.WhoReadTableResponse;
import com.example.logdatafrommember.logging.entity.WhoReadTable;
import com.example.logdatafrommember.logging.repository.WhoReadTableRepository;
import com.example.logdatafrommember.security.entity.UserWithRoles;
import com.example.logdatafrommember.security.repository.UserWithRolesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.security.Principal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WhoReadTableService {

  private final WhoReadTableRepository whoReadTableRepository;
  private final UserWithRolesRepository userWithRolesRepository;

  public WhoReadTableService(WhoReadTableRepository whoReadTableRepository,
                             UserWithRolesRepository userWithRolesRepository) {
    this.whoReadTableRepository = whoReadTableRepository;
    this.userWithRolesRepository = userWithRolesRepository;
  }

  @Transactional
  public void clearWhoReadTable() {
    whoReadTableRepository.deleteByReadTimeLessThan(LocalDateTime.now().minusDays(1));
  }

  public void registerRead(Principal p, String tableName) {
    UserWithRoles user = userWithRolesRepository.findByUsername(p.getName()).orElseThrow(() -> new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Could not find user, with that username"));
    WhoReadTable whoReadTable = WhoReadTable.builder()
        .userWithRoles(user)
        .tableName(tableName)
        .build();
    whoReadTableRepository.save(whoReadTable);
  }

  public List<WhoReadTableResponse> getAllReads() {
    List<WhoReadTable> whoReadTableList = whoReadTableRepository.findAll();
    return whoReadTableList.stream().map(WhoReadTableResponse::new).collect(Collectors.toList());
  }

}
