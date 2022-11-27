package com.example.logdatafrommember.projectExample.api;

import com.example.logdatafrommember.projectExample.dto.book.BookResponse;
import com.example.logdatafrommember.projectExample.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/book")
public class BookController {

  BookService bookService;

  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping("/{id}")
  public BookResponse getBookById(@PathVariable Long id) {
    return bookService.getBookById(id);
  }

}
