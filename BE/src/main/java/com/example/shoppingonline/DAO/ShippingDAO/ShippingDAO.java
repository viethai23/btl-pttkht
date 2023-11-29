package com.example.shoppingonline.DAO.ShippingDAO;

import com.example.shoppingonline.Model.Order.Order;
import com.example.shoppingonline.Model.Order.Shipping;

public interface ShippingDAO {

	Shipping calculateCost(Shipping s);

	boolean cancelShipping(Shipping s);
}