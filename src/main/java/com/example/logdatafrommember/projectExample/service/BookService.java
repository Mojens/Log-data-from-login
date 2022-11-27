package com.example.logdatafrommember.projectExample.service;

import com.example.logdatafrommember.projectExample.dto.book.BookResponse;
import com.example.logdatafrommember.projectExample.entity.Book;
import com.example.logdatafrommember.projectExample.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

@Service
public class BookService {

  BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public BookResponse getBookById(@PathVariable Long id) {
    Book foundBook = bookRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Book not found"));
    return new BookResponse(foundBook);
  }

}
