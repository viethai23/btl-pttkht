package com.example.shoppingonline.Controller;

import com.example.shoppingonline.DAO.CartDAO.CartDAO;
import com.example.shoppingonline.Model.Order.Cart;
import com.example.shoppingonline.Model.Order.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartDAO cartDAO;

    @PostMapping("/clear/{cartId}")
    public Cart clearCart(@PathVariable int cartId) {
        return cartDAO.clearCart(cartId);
    }

    @PostMapping("/add/{cartId}")
    public Cart addCartItem(@PathVariable int cartId, @RequestBody Item item) {
        return cartDAO.addCartItem(cartId, item);
    }

    @PostMapping("/remove/{cartId}/{itemId}")
    public Cart removeCartItem(@PathVariable int cartId, @PathVariable int itemId) {
        return cartDAO.removeCartItem(cartId, itemId);
    }

    @GetMapping("/get/{cusId}")
    public Cart getCustomerCart(@PathVariable int cusId) {
        return cartDAO.getCustomerCart(cusId);
    }

    @PostMapping("/updateQuantity/{cartId}/{itemId}/{quantity}")
    public Cart updateQuantity(
            @PathVariable int cartId,
            @PathVariable int itemId,
            @PathVariable int quantity
    ) {
        return cartDAO.updateQuantity(cartId, itemId, quantity);
    }

    @GetMapping("/createCart/{customerId}")
    public Cart createCart(@PathVariable int customerId) {
        return cartDAO.createCart(customerId);
    }
}
