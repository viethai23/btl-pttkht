package com.example.shoppingonline.DAO.ReviewDAO;

import com.example.shoppingonline.Model.Product.Product;
import com.example.shoppingonline.Model.Product.Review;
import com.example.shoppingonline.Model.User.Customer;

import java.util.List;

public interface ReviewDAO {

	boolean deleteReview(int reviewId);

	Review addReview(Review rv);

	List<Review> getProductReview(int productId);

	Review getReview(int customerId, int productId);

}