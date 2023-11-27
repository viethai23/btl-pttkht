package com.example.shoppingonline.Controller;

import com.example.shoppingonline.DAO.PaymentDAO.PaymentDAO;
import com.example.shoppingonline.Model.Order.Cart;
import com.example.shoppingonline.Model.Order.Order;
import com.example.shoppingonline.Model.Order.Payment;
import com.example.shoppingonline.Model.Order.Shipping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentDAO paymentDAO;

    @Autowired
    public PaymentController(PaymentDAO paymentDAO) {
        this.paymentDAO = paymentDAO;
    }

    @PostMapping("/calculateCost")
    public double calculateCost(@RequestBody Cart cart, @RequestBody Shipping shipping) {
        return paymentDAO.calculateCost(cart, shipping);
    }

    @DeleteMapping("/refundPayment/{paymentId}")
    public boolean refundPayment(@PathVariable int paymentId) {
        return paymentDAO.refundPayment(paymentId);
    }

    @PostMapping("/processPayment")
    public boolean processPayment(@RequestBody Payment payment) {
        return paymentDAO.processPayment(payment);
    }
}
