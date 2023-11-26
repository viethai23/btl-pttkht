package com.example.shoppingonline.Controller;

import com.example.shoppingonline.DAO.ShippingDAO.ShippingDAO;
import com.example.shoppingonline.Model.Order.Order;
import com.example.shoppingonline.Model.Order.Shipping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    private final ShippingDAO shippingDAO;

    @Autowired
    public ShippingController(ShippingDAO shippingDAO) {
        this.shippingDAO = shippingDAO;
    }

    @PostMapping("/calculateCost")
    public double calculateCost(@RequestBody Shipping shipping) {
        return shippingDAO.calculateCost(shipping);
    }

    @DeleteMapping("/cancelShipping")
    public boolean cancelShipping(@RequestBody Shipping shipping) {
        return shippingDAO.cancelShipping(shipping);
    }

    @PostMapping("/addShipping")
    public Shipping addShipping(@RequestBody Order order, @RequestBody Shipping shipping) {
        return shippingDAO.addShipping(order, shipping);
    }
}
