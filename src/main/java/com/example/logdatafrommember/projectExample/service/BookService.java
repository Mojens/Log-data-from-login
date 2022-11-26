package com.example.logdatafrommember.projectExample.service;

import com.example.logdatafrommember.projectExample.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }


}
