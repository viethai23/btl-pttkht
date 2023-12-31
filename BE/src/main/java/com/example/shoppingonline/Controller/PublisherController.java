package com.example.shoppingonline.Controller;

import com.example.shoppingonline.DAO.AuthorDAO.AuthorDAO;
import com.example.shoppingonline.DAO.PublisherDAO.PublisherDAO;
import com.example.shoppingonline.Model.Product.Author;
import com.example.shoppingonline.Model.Product.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/publishers")
@CrossOrigin
public class PublisherController {
    @Autowired
    private PublisherDAO publisherDAO;

    @GetMapping
    public List<Publisher> getAllPublishers() {
        return publisherDAO.getAllPublishers();
    }
}
