package com.example.shoppingonline.DAO.ReviewDAO;

import com.example.shoppingonline.Model.Product.Product;
import com.example.shoppingonline.Model.Product.Review;
import com.example.shoppingonline.Model.User.Customer;

import com.example.shoppingonline.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewDAOImpl implements ReviewDAO {

	@Autowired
	private ReviewRepository reviewRepository;

	@Override
	public boolean deleteReview(int reviewId) {
		if (reviewRepository.existsById(reviewId)) {
			reviewRepository.deleteById(reviewId);
			return true;
		}
		return false;
	}

	@Override
	public Review addReview(Review rv) {
		return reviewRepository.save(rv);
	}

	@Override
	public List<Review> getProductReview(int productId) {
		return reviewRepository.findAllByProduct_Id(productId);
	}

	@Override
	public Review getReview(int customerId, int productId) {
		return reviewRepository.findByCustomer_IdAndProduct_Id(customerId, productId);
	}

}