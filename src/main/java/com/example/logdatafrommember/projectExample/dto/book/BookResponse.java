package com.example.logdatafrommember.projectExample.dto.book;

import com.example.logdatafrommember.projectExample.entity.Book;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookResponse {

  private String title;


  private String author;


  private String year;

  public BookResponse(Book book) {
    this.title = book.getTitle();
    this.author = book.getAuthor();
    this.year = book.getYear();
  }
}
