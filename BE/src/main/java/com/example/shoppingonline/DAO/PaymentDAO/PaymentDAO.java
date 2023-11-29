package com.example.shoppingonline.DAO.PaymentDAO;

import com.example.shoppingonline.Model.Order.Cart;
import com.example.shoppingonline.Model.Order.Order;
import com.example.shoppingonline.Model.Order.Payment;
import com.example.shoppingonline.Model.Order.Shipping;

public interface PaymentDAO {

	Payment calculateCost(Cart c, Shipping sh, Payment p);

	boolean refundPayment(int paymentId);
	boolean processPayment(Payment p);
}