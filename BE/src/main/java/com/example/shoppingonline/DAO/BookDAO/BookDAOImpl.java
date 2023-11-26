package com.example.shoppingonline.DAO.BookDAO;

import com.example.shoppingonline.Model.Product.Book;
import com.example.shoppingonline.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookDAOImpl implements BookDAO {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book getBook(int bookId) {
        return bookRepository.findById(bookId).orElse(null);
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book editBook(int bookId, Book book) {
        Book existingBook = getBook(bookId);
        if (existingBook != null) {
            existingBook.setTitle(book.getTitle());
            existingBook.setGenre(book.getGenre());
            existingBook.setType(book.getType());
            existingBook.setYearOfPublisher(book.getYearOfPublisher());
            existingBook.setPublisher(book.getPublisher());
            existingBook.setAuthor(book.getAuthor());
            return bookRepository.save(existingBook);
        }
        return null;
    }
}
