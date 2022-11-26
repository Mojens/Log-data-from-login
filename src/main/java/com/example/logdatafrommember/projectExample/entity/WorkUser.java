package com.example.logdatafrommember.projectExample.entity;

import com.example.logdatafrommember.security.entity.UserWithRoles;
import com.example.logdatafrommember.security.enums.Role;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "WORK")
public class WorkUser extends UserWithRoles {

  @Column
  private String firstName;

  @Column
  private String lastName;



  @Builder(builderMethodName = "workUserBuilder")
  public WorkUser(String user, String password, String email, String firstName, String lastName) {
    super(user, password, email);
    this.firstName = firstName;
    this.lastName = lastName;
    getRoles().add(Role.ADMIN);
  }
}
