package com.example.logdatafrommember.projectExample.repository;

import com.example.logdatafrommember.projectExample.entity.CasualUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CasualUserRepository extends JpaRepository<CasualUser, Long> {

}
