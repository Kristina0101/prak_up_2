package com.example.prak_up_2.service;

import com.example.prak_up_2.model.BookModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<BookModel> findAllBooks();

    BookModel findBookById(int id);

    BookModel addBook(BookModel book);

    BookModel updateBook(BookModel book);

    void deleteBook(int id);
}
