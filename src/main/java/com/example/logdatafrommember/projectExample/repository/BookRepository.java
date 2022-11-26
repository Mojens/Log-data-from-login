package com.example.logdatafrommember.projectExample.repository;

import com.example.logdatafrommember.projectExample.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {


}
