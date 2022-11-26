package com.example.logdatafrommember.projectExample.service;

import com.example.logdatafrommember.projectExample.repository.CasualUserRepository;
import org.springframework.stereotype.Service;

@Service
public class CasualUserService {

  CasualUserRepository casualUserRepository;

  public CasualUserService(CasualUserRepository casualUserRepository) {
    this.casualUserRepository = casualUserRepository;
  }
}
