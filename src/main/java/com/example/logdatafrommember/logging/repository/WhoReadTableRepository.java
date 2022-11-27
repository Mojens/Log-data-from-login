package com.example.logdatafrommember.logging.repository;

import com.example.logdatafrommember.logging.entity.WhoReadTable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

public interface WhoReadTableRepository extends JpaRepository<WhoReadTable, Long> {

  @Transactional
  void deleteByReadTimeLessThan(LocalDateTime date);

}
