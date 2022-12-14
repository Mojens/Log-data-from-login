package com.example.logdatafrommember.security.repository;



import com.example.logdatafrommember.security.entity.UserWithRoles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface
UserWithRolesRepository extends JpaRepository<UserWithRoles, String> {
  Boolean existsByEmail(String email);
  Optional<UserWithRoles> findByUsername(String userName);
}
