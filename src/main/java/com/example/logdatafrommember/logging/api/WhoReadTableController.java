package com.example.logdatafrommember.logging.api;


import com.example.logdatafrommember.logging.dto.hasAddedUser.WhoReadTableResponse;
import com.example.logdatafrommember.logging.service.WhoReadTableService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/log/read")
@CrossOrigin
public class WhoReadTableController {

  WhoReadTableService whoReadTableService;

  public WhoReadTableController(WhoReadTableService whoReadTableService) {
    this.whoReadTableService = whoReadTableService;
  }

  @PreAuthorize("hasAuthority('ADMIN')")
  @GetMapping("/library/all")
  public List<WhoReadTableResponse> getAllReads() {
    whoReadTableService.clearWhoReadTable();
    return whoReadTableService.getAllReads();
  }
}
