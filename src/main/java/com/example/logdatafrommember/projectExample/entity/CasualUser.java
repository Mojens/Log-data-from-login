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

@Entity(name = "CASUAL")
public class CasualUser extends UserWithRoles {

  @Column
  private String firstName;

  @Column
  private String lastName;

  @Column
  private String adress;

  @Column
  private String city;

  @Builder(builderMethodName = "casualUserBuilder")
  public CasualUser(String user, String password, String email, String firstName, String lastName, String adress, String city) {
    super(user, password, email);
    this.firstName = firstName;
    this.lastName = lastName;
    this.adress = adress;
    this.city = city;
    getRoles().add(Role.USER);
  }
}
