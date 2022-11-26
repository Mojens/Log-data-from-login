package com.example.logdatafrommember.projectExample.repository;

import com.example.logdatafrommember.projectExample.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {

}
