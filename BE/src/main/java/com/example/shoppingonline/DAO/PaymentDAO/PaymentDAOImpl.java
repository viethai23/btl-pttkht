package com.example.shoppingonline.DAO.PaymentDAO;

import com.example.shoppingonline.Model.Order.Cart;
import com.example.shoppingonline.Model.Order.Order;
import com.example.shoppingonline.Model.Order.Payment;
import com.example.shoppingonline.Model.Order.Shipping;

import com.example.shoppingonline.Repository.OrderRepository;
import com.example.shoppingonline.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDAOImpl implements PaymentDAO {

	private final PaymentRepository paymentRepository;


	@Autowired
	public PaymentDAOImpl(PaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}

	@Override
	public double calculateCost(Cart c, Shipping sh) {
		return c.getTotal() + sh.getAmount();
	}

	@Override
	public boolean refundPayment(int paymentId) {
		Payment payment = paymentRepository.findById(paymentId).orElse(null);
		if (payment != null) {
			payment.setStatus("Refunded");
			paymentRepository.save(payment);
			return true;
		}
		return false;
	}

	@Override
	public boolean processPayment(Payment p) {
		p.setStatus("Successful");
		paymentRepository.save(p);
		return true;
	}
}