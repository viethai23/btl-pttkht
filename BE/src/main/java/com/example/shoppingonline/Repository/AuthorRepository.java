package com.example.shoppingonline.Repository;

import com.example.shoppingonline.Model.Product.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
