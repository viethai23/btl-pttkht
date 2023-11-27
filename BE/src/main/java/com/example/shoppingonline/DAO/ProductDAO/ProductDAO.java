package com.example.shoppingonline.DAO.ProductDAO;

import com.example.shoppingonline.Model.Order.Item;
import com.example.shoppingonline.Model.Product.Category;
import com.example.shoppingonline.Model.Product.Product;

import java.util.List;

public interface ProductDAO {
	List<Product> getListProduct();

	List<Product> getProductByName(String s);

	List<Product> getProductByCategory(int categoryId);

	List<Product> getProductByPrice(double p);

}