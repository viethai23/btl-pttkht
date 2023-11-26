package com.example.shoppingonline.Controller;

import com.example.shoppingonline.DAO.ReviewDAO.ReviewDAO;
import com.example.shoppingonline.Model.Product.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewDAO reviewDAO;

    @DeleteMapping("/{reviewId}")
    public boolean deleteReview(@PathVariable int reviewId) {
        return reviewDAO.deleteReview(reviewId);
    }

    @PostMapping("/add")
    public Review addReview(@RequestBody Review review) {
        return reviewDAO.addReview(review);
    }

    @GetMapping("/product/{productId}")
    public List<Review> getProductReview(@PathVariable int productId) {
        return reviewDAO.getProductReview(productId);
    }

    @GetMapping("/{customerId}/{productId}")
    public Review getReview(@PathVariable int customerId, @PathVariable int productId) {
        return reviewDAO.getReview(customerId, productId);
    }

}
