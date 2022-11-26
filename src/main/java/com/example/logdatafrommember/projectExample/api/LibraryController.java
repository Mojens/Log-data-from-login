package com.example.logdatafrommember.projectExample.api;

import com.example.logdatafrommember.projectExample.dto.library.LibraryResponse;
import com.example.logdatafrommember.projectExample.service.LibraryService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/library/")
@CrossOrigin
public class LibraryController {

  LibraryService libraryService;

  public LibraryController(LibraryService libraryService) {
    this.libraryService = libraryService;
  }

  @PreAuthorize("hasAuthority('ADMIN')")
  @GetMapping("/all")
  public List<LibraryResponse> getAllLibraries(Principal p) {
    return libraryService.getAllLibraries(p);
  }

  @PreAuthorize("hasAuthority('ADMIN')")
  @GetMapping("/{id}")
  public List<LibraryResponse> getSpecificLibrary(@PathVariable Long id,
                                                  Principal p) {
    return libraryService.getAllLibraries(p);
  }

}
