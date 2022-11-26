package com.example.logdatafrommember.configuration;


import com.example.logdatafrommember.projectExample.entity.Book;
import com.example.logdatafrommember.projectExample.entity.CasualUser;
import com.example.logdatafrommember.projectExample.entity.Library;
import com.example.logdatafrommember.projectExample.entity.WorkUser;
import com.example.logdatafrommember.projectExample.repository.BookRepository;
import com.example.logdatafrommember.projectExample.repository.CasualUserRepository;
import com.example.logdatafrommember.projectExample.repository.LibraryRepository;
import com.example.logdatafrommember.projectExample.repository.WorkUserRepository;
import com.example.logdatafrommember.security.repository.UserWithRolesRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;


import java.util.List;


@Controller
public class SetUpTestLogins implements ApplicationRunner {

  UserWithRolesRepository userWithRolesRepository;
  String passwordUsedByAll;
  CasualUserRepository casualUserRepository;
  BookRepository bookRepository;
  WorkUserRepository workUserRepository;
  LibraryRepository libraryRepository;

  public SetUpTestLogins(UserWithRolesRepository userWithRolesRepository,
                         CasualUserRepository casualUserRepository,
                         BookRepository bookRepository,
                         WorkUserRepository workUserRepository,
                         LibraryRepository libraryRepository) {
    this.userWithRolesRepository = userWithRolesRepository;
    this.casualUserRepository = casualUserRepository;
    this.bookRepository = bookRepository;
    passwordUsedByAll = "test12";
    this.workUserRepository = workUserRepository;
    this.libraryRepository = libraryRepository;
  }

  @Override
  public void run(ApplicationArguments args) {
    setupUserLogins();
    createLibraryWithBooks();

  }

  public void setupUserLogins() {
    CasualUser casualUser1 = CasualUser.casualUserBuilder()
        .user("CasualUser_1231")
        .password(passwordUsedByAll)
        .email("janUser@gmail.com")
        .firstName("Jan")
        .lastName("Kowalski")
        .adress("ul. Kowalska 1")
        .city("Warszawa")
        .build();
    casualUserRepository.save(casualUser1);

    WorkUser workUser1 = WorkUser.workUserBuilder()
        .firstName("michael")
        .lastName("jackson")
        .user("WorkUser_1231")
        .password(passwordUsedByAll)
        .email("workUser@gmail.com")
        .build();
    workUserRepository.save(workUser1);
  }

  public void createLibraryWithBooks() {

    Library library1 = Library.builder()
        .name("Polish Library")
        .adress("ul. Kowalska 1")
        .city("Warszawa")
        .postalCode("00-001")
        .build();
    Library library2 = Library.builder()
        .name("Swedish Library")
        .adress("Roslagsgatan 10 ")
        .city("Stockholm")
        .postalCode("113-51")
        .build();
  libraryRepository.save(library1);
  libraryRepository.save(library2);
  bookRepository.saveAll(bookList1(library1));
  bookRepository.saveAll(bookList2(library2));
  }

  public List<Book> bookList1(Library library) {
    Book book1 = Book.builder()
        .library(library)
        .title("Harry Potter - The Philosopher's Stone")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book2 = Book.builder()
        .library(library)
        .title("Harry Potter - The Chamber of Secrets")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book3 = Book.builder()
        .library(library)
        .title("Harry Potter - The Prisoner of Azkaban")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book4 = Book.builder()
        .library(library)
        .title("Harry Potter - The Goblet of Fire")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book5 = Book.builder()
        .library(library)
        .title("Harry Potter - The Order of the Phoenix")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book6 = Book.builder()
        .library(library)
        .title("Harry Potter - The Half-Blood Prince")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book7 = Book.builder()
        .library(library)
        .title("Harry Potter - The Deathly Hallows")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book8 = Book.builder()
        .library(library)
        .title("Harry Potter - The Cursed Child")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book9 = Book.builder()
        .library(library)
        .title("Harry Potter - The Tales of Beedle the Bard")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book10 = Book.builder()
        .library(library)
        .title("Harry Potter - Fantastic Beasts and Where to Find Them")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    return List.of(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10);
  }
  public List<Book> bookList2(Library library) {
    Book book1 = Book.builder()
        .library(library)
        .title("Jerry Potter - The Philosopher's Stone")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book2 = Book.builder()
        .library(library)
        .title("Jerry Potter - The Chamber of Secrets")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book3 = Book.builder()
        .library(library)
        .title("Jerry Potter - The Prisoner of Azkaban")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book4 = Book.builder()
        .library(library)
        .title("Jerry Potter - The Goblet of Fire")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book5 = Book.builder()
        .library(library)
        .title("Jerry Potter - The Order of the Phoenix")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book6 = Book.builder()
        .library(library)
        .title("Jerry Potter - The Half-Blood Prince")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book7 = Book.builder()
        .library(library)
        .title("Jerry Potter - The Deathly Hallows")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book8 = Book.builder()
        .library(library)
        .title("Jerry Potter - The Cursed Child")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book9 = Book.builder()
        .library(library)
        .title("Jerry Potter - The Tales of Beedle the Bard")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    Book book10 = Book.builder()
        .library(library)
        .title("Jerry Potter - Fantastic Beasts and Where to Find Them")
        .author("J.K. Rowling")
        .year("1997")
        .build();

    return List.of(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10);
  }
}
