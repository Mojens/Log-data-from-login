package com.example.logdatafrommember.logging.dto.hasAddedUser;


import com.example.logdatafrommember.logging.entity.HasLoggedIn;
import com.example.logdatafrommember.logging.entity.WhoReadTable;
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
public class WhoReadTableResponse {

  private String userName;

  private String tableName;

  private Long userId;


  @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
  private LocalDateTime readTime;

  public WhoReadTableResponse(WhoReadTable whoReadTable) {
    this.userName = whoReadTable.getUserWithRoles().getUsername();
    this.tableName = whoReadTable.getTableName();
    this.userId = whoReadTable.getUserWithRoles().getId();
    this.readTime = whoReadTable.getReadTime();
  }
}
