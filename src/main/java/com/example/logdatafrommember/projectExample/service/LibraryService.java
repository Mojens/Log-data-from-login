package com.example.logdatafrommember.projectExample.service;

import com.example.logdatafrommember.logging.service.WhoReadTableService;
import com.example.logdatafrommember.projectExample.dto.library.LibraryResponse;
import com.example.logdatafrommember.projectExample.entity.Library;
import com.example.logdatafrommember.projectExample.repository.LibraryRepository;
import com.example.logdatafrommember.security.repository.UserWithRolesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.security.Principal;
import java.util.*;

@Service
public class LibraryService {

  private final LibraryRepository libraryRepository;
  private final UserWithRolesRepository userWithRolesRepository;
  private final WhoReadTableService whoReadTableService;

  public LibraryService(LibraryRepository libraryRepository,
                        UserWithRolesRepository userWithRolesRepository,
                        WhoReadTableService whoReadTableService) {
    this.libraryRepository = libraryRepository;
    this.userWithRolesRepository = userWithRolesRepository;
    this.whoReadTableService = whoReadTableService;
  }

  public List<LibraryResponse> getAllLibraries(Principal p) {
    whoReadTableService.registerRead(p, "Library-all");
    List<Library> libraryList = libraryRepository.findAll();
    return libraryList.stream().map(LibraryResponse::new).toList();
  }
}
