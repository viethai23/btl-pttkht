package com.example.shoppingonline.DAO.OrderDAO;

import com.example.shoppingonline.Model.Order.Cart;
import com.example.shoppingonline.Model.Order.Order;
import com.example.shoppingonline.Model.Order.Payment;
import com.example.shoppingonline.Model.Order.Shipping;
import com.example.shoppingonline.Model.User.Customer;

import java.util.Date;
import java.util.List;

import com.example.shoppingonline.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order placeOrder(Customer cus, Cart cart) {
		Order order = new Order();
		order.setCustomer(cus);
		order.setCart(cart);
		order.setOrderDate(new Date());
		order.setStatus("Placed");

		return orderRepository.save(order);
	}

	@Override
	public Order confirmOrder(Order order) {
		order.setStatus("Confirmed");
		return orderRepository.save(order);
	}

	@Override
	public List<Order> getCustomerOrder(Customer c) {
		return orderRepository.findByCustomer(c);
	}

	@Override
	public Order getOrder(int id) {
		return orderRepository.findById(id).orElse(null);
	}

	@Override
	public boolean cancelOrder(Order order) {
		orderRepository.delete(order);
		return true;
	}

	@Override
	public List<Order> getAllOrder() {
		return orderRepository.findAll();
	}

	@Override
	public Shipping getShipping(int orderId) {
		return getOrder(orderId).getShipping();
	}

	@Override
	public Payment getPayment(int orderId) {
		return getOrder(orderId).getPayment();
	}

	@Override
	public Customer getCustomer(int orderId) {
		return getOrder(orderId).getCustomer();
	}

	@Override
	public Cart getCart(int orderId) {
		return getOrder(orderId).getCart();
	}
}