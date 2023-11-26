package com.example.shoppingonline.Controller;

import com.example.shoppingonline.DAO.MobilePhoneDAO.MobilePhoneDAO;
import com.example.shoppingonline.Model.Product.MobilePhone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mobile-phones")
@CrossOrigin
public class MobilePhoneController {

    @Autowired
    private MobilePhoneDAO mobilePhoneDAO;

    @GetMapping("/{mbId}")
    public MobilePhone getMobilePhone(@PathVariable int mbId) {
        return mobilePhoneDAO.getMobilePhone(mbId);
    }

    @PostMapping
    public MobilePhone addMobilePhone(@RequestBody MobilePhone mobilePhone) {
        return mobilePhoneDAO.addMobilePhone(mobilePhone);
    }

    @PutMapping("/{mbId}")
    public MobilePhone editMobilePhone(@PathVariable int mbId, @RequestBody MobilePhone mobilePhone) {
        return mobilePhoneDAO.editMobilePhone(mbId, mobilePhone);
    }
}
