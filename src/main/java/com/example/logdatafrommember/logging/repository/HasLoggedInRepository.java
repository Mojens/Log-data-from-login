package com.example.logdatafrommember.logging.repository;

import com.example.logdatafrommember.logging.entity.HasLoggedIn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HasLoggedInRepository extends JpaRepository<HasLoggedIn, Long> {

}
