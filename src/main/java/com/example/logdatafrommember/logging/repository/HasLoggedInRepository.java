package com.example.logdatafrommember.logging.repository;

import com.example.logdatafrommember.logging.entity.HasLoggedIn;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

public interface HasLoggedInRepository extends JpaRepository<HasLoggedIn, Long> {

  @Transactional
  void deleteByLoginTimeLessThan(LocalDateTime date);

}
