package com.example.shoppingonline.Repository;

import com.example.shoppingonline.Model.Product.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {

    List<Review> findAllByProduct_Id(int productId);

    Review findByCustomer_IdAndProduct_Id(int customerId, int productId);

}
