package com.example.prak_up_2.controller;

import com.example.prak_up_2.model.BookModel;
import com.example.prak_up_2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String getAllBooks(Model model) {
        model.addAttribute("books", bookService.findAllBooks());
        return "bookList";
    }

    @PostMapping("/books/add")
    public String addBook(@RequestParam String name,
                          @RequestParam String author,
                          @RequestParam String publishing,
                          @RequestParam int yearPublishing) {
        BookModel newBook = new BookModel(0, name, author, publishing, yearPublishing);
        bookService.addBook(newBook);
        return "redirect:/books";
    }

    @PostMapping("/books/update")
    public String updateBook(@RequestParam int id,
                             @RequestParam String name,
                             @RequestParam String author,
                             @RequestParam String publishing,
                             @RequestParam int yearPublishing) {
        BookModel updatedBook = new BookModel(id, name, author, publishing, yearPublishing);
        bookService.updateBook(updatedBook);
        return "redirect:/books";
    }

    @PostMapping("/books/delete")
    public String deleteBook(@RequestParam int id) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }
}
