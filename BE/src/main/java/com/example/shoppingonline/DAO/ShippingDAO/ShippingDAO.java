package com.example.shoppingonline.DAO.ShippingDAO;

import com.example.shoppingonline.Model.Order.Order;
import com.example.shoppingonline.Model.Order.Shipping;

public interface ShippingDAO {

	double calculateCost(Shipping s);

	boolean cancelShipping(Shipping s);
	Shipping addShipping(Order o, Shipping s);
}