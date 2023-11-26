package com.example.shoppingonline.DAO.BookDAO;

import com.example.shoppingonline.Model.Product.Book;

public interface BookDAO {
    Book getBook(int bookId);
    Book addBook(Book book);
    Book editBook(int bookId, Book book);
}
