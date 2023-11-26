package com.example.shoppingonline.DAO.PaymentDAO;

import com.example.shoppingonline.Model.Order.Cart;
import com.example.shoppingonline.Model.Order.Order;
import com.example.shoppingonline.Model.Order.Payment;
import com.example.shoppingonline.Model.Order.Shipping;

public interface PaymentDAO {

	double calculateCost(Cart c, Shipping sh);

	boolean refundPayment(int paymentId);
	Payment addPayment(Order o, Payment p);
	boolean processPayment(Payment p);
}