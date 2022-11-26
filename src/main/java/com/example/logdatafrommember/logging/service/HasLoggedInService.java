package com.example.logdatafrommember.logging.service;

import com.example.logdatafrommember.logging.dto.hasLoggedIn.HasLoggedInResponse;
import com.example.logdatafrommember.logging.entity.HasLoggedIn;
import com.example.logdatafrommember.logging.repository.HasLoggedInRepository;
import com.example.logdatafrommember.security.entity.UserWithRoles;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HasLoggedInService {

  HasLoggedInRepository hasLoggedInRepository;

  public HasLoggedInService(HasLoggedInRepository hasLoggedInRepository) {
    this.hasLoggedInRepository = hasLoggedInRepository;
  }

  public void registerLogin(UserWithRoles userWithRoles) {
    HasLoggedIn hasLoggedIn = HasLoggedIn.builder()
        .userWithRoles(userWithRoles)
        .build();
    hasLoggedInRepository.save(hasLoggedIn);
  }

  public List<HasLoggedInResponse> getAllLogins() {
    List<HasLoggedIn> hasLoggedInList = hasLoggedInRepository.findAll();
   return hasLoggedInList.stream().map(HasLoggedInResponse::new).collect(Collectors.toList());
  }

}
