package com.example.shoppingonline.DAO.ShippingDAO;

import com.example.shoppingonline.Model.Order.Order;
import com.example.shoppingonline.Model.Order.Shipping;

import com.example.shoppingonline.Repository.OrderRepository;
import com.example.shoppingonline.Repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ShippingDAOImpl implements ShippingDAO {

	private final ShippingRepository shippingRepository;
	private final OrderRepository orderRepository;

	@Autowired
	public ShippingDAOImpl(ShippingRepository shippingRepository, OrderRepository orderRepository) {
		this.shippingRepository = shippingRepository;
		this.orderRepository = orderRepository;
	}

	@Override
	public double calculateCost(Shipping s) {
		return 0;
	}

	@Override
	public boolean cancelShipping(Shipping s) {
		shippingRepository.delete(s);
		return true;
	}

	@Override
	public Shipping addShipping(Order o, Shipping s) {
		s.setAmount(calculateCost(s));
		s.setStatus("Pending");
		s = shippingRepository.save(s);
		o.setShipping(s);
		orderRepository.save(o);
		return s;
	}
}