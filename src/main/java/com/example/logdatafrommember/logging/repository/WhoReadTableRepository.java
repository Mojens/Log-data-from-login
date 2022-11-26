package com.example.logdatafrommember.logging.repository;

import com.example.logdatafrommember.logging.entity.WhoReadTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WhoReadTableRepository extends JpaRepository<WhoReadTable, Long> {

}
