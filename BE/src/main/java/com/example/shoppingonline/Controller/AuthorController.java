package com.example.shoppingonline.Controller;

import com.example.shoppingonline.DAO.AuthorDAO.AuthorDAO;
import com.example.shoppingonline.Model.Product.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
@CrossOrigin
public class AuthorController {

    @Autowired
    private AuthorDAO authorDAO;

    @GetMapping
    public List<Author> getAllCustomers() {
        return authorDAO.getAllAuthor();
    }
}
