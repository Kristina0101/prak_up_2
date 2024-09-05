package com.example.prak_up_2.service;

import com.example.prak_up_2.model.BookModel;
import com.example.prak_up_2.repository.InMemoryBookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryBookServiceImpl implements BookService {
    private final InMemoryBookRepository bookRepository;

    public InMemoryBookServiceImpl(InMemoryBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookModel> findAllBooks() {
        return bookRepository.findAllBooks();
    }

    @Override
    public BookModel findBookById(int id) {
        return bookRepository.findBookById(id);
    }

    @Override
    public BookModel addBook(BookModel book) {
        return bookRepository.addBook(book);
    }

    @Override
    public BookModel updateBook(BookModel book) {
        return bookRepository.updateBook(book);
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.deleteBook(id);
    }
}
