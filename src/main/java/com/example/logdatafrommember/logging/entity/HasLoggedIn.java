package com.example.logdatafrommember.logging.entity;

import com.example.logdatafrommember.security.entity.UserWithRoles;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class HasLoggedIn {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @CreationTimestamp
  private LocalDateTime loginTime;

  @OneToOne
  @JoinColumn(nullable = false, name = "user_id")
  private UserWithRoles userWithRoles;
}
