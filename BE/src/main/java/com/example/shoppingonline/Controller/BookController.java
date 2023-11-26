package com.example.shoppingonline.Controller;

import com.example.shoppingonline.DAO.BookDAO.BookDAO;
import com.example.shoppingonline.Model.Product.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class BookController {

    @Autowired
    private BookDAO bookDAO;

    @GetMapping("/{bookId}")
    public Book getBook(@PathVariable int bookId) {
        return bookDAO.getBook(bookId);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookDAO.addBook(book);
    }

    @PutMapping("/{bookId}")
    public Book editBook(@PathVariable int bookId, @RequestBody Book book) {
        return bookDAO.editBook(bookId, book);
    }
}
