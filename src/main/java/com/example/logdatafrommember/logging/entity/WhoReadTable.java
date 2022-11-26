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
public class WhoReadTable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @CreationTimestamp
  private LocalDateTime readTime;

  @OneToOne
  @JoinColumn(nullable = false, name = "user_id")
  private UserWithRoles userWithRoles;

  @Column(nullable = false, length = 50, name = "table_name")
  private String tableName;
}
