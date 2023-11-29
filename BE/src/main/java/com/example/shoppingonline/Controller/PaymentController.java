package com.example.shoppingonline.Controller;

import com.example.shoppingonline.DAO.PaymentDAO.PaymentDAO;
import com.example.shoppingonline.Model.Order.Cart;
import com.example.shoppingonline.Model.Order.Order;
import com.example.shoppingonline.Model.Order.Payment;
import com.example.shoppingonline.Model.Order.Shipping;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
@CrossOrigin
public class PaymentController {

    private final PaymentDAO paymentDAO;

    @Autowired
    public PaymentController(PaymentDAO paymentDAO) {
        this.paymentDAO = paymentDAO;
    }

    @PostMapping("/calculateCost")
    public Payment calculateCost(@RequestBody PaymentCalculate paymentCalculate) {
        return paymentDAO.calculateCost(paymentCalculate.getCart(), paymentCalculate.getShipping(), paymentCalculate.getPayment());
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

@Data
class PaymentCalculate {
    private Shipping shipping;
    private Payment payment;
    private Cart cart;
}
