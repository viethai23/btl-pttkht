package com.example.shoppingonline.Repository;

import com.example.shoppingonline.Model.Product.Author;
import com.example.shoppingonline.Model.Product.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer> {
}
