package com.example.prak_up_2.repository;

import com.example.prak_up_2.model.BookModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class InMemoryBookRepository {
    private final List<BookModel> books = new ArrayList<>();
    private final AtomicInteger idCounter = new AtomicInteger(1);

    public BookModel addBook(BookModel book) {
        book.setId(idCounter.getAndIncrement());
        books.add(book);
        return book;
    }

    public BookModel updateBook(BookModel book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == book.getId()) {
                books.set(i, book);
                return book;
            }
        }
        return null;
    }

    public void deleteBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }

    public List<BookModel> findAllBooks() {
        return new ArrayList<>(books);
    }

    public BookModel findBookById(int id) {
        return books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
