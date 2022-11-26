package com.example.logdatafrommember.logging.dto.hasLoggedIn;

import com.example.logdatafrommember.logging.entity.HasLoggedIn;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HasLoggedInResponse {

  private String userName;

  private String eMail;

  private Long userId;

  @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
  private LocalDateTime loginTime;

  public HasLoggedInResponse(HasLoggedIn hasLoggedIn) {
    this.userName = hasLoggedIn.getUserWithRoles().getUsername();
    this.eMail = hasLoggedIn.getUserWithRoles().getEmail();
    this.userId = hasLoggedIn.getUserWithRoles().getId();
    this.loginTime = hasLoggedIn.getLoginTime();

  }


}

