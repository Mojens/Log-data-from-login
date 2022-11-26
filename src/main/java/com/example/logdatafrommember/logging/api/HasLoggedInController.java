package com.example.logdatafrommember.logging.api;

import com.example.logdatafrommember.logging.dto.hasLoggedIn.HasLoggedInResponse;
import com.example.logdatafrommember.logging.service.HasLoggedInService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    return hasLoggedInService.getAllLogins();
  }

}
