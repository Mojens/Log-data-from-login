package com.example.logdatafrommember.logging.api;

import com.example.logdatafrommember.logging.dto.hasLoggedIn.HasLoggedInResponse;
import com.example.logdatafrommember.logging.service.HasLoggedInService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/log/login")
@CrossOrigin
public class HasLoggedInController {

  HasLoggedInService hasLoggedInService;

  public HasLoggedInController(HasLoggedInService hasLoggedInService) {
    this.hasLoggedInService = hasLoggedInService;
  }

  @GetMapping
  public List<HasLoggedInResponse> getAllLogins() {
    //Clear logs that are over 30 days old
    hasLoggedInService.clearLogsByDate();
    return hasLoggedInService.getAllLogins();
  }

}
