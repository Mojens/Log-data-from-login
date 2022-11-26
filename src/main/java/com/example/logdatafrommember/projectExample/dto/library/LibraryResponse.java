package com.example.logdatafrommember.projectExample.dto.library;


import com.example.logdatafrommember.projectExample.dto.book.BookResponse;
import com.example.logdatafrommember.projectExample.entity.Book;
import com.example.logdatafrommember.projectExample.entity.Library;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.Column;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LibraryResponse {

  private String name;

  private String adress;

  private String city;

  private String postalCode;

  private List<BookResponse> bookList;

  public LibraryResponse(Library library) {
    this.name = library.getName();
    this.adress = library.getAdress();
    this.city = library.getCity();
    this.postalCode = library.getPostalCode();
    if (library.getBookList() != null) {
      this.bookList = library.getBookList().stream().map(BookResponse::new).collect(Collectors.toList());
    } else
      this.bookList = null;
  }


}
