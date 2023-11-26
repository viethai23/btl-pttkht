package com.example.shoppingonline.DAO.MobilePhoneDAO;

import com.example.shoppingonline.Model.Product.MobilePhone;

public interface MobilePhoneDAO {
    MobilePhone getMobilePhone(int mbId);
    MobilePhone addMobilePhone(MobilePhone mb);
    MobilePhone editMobilePhone(int mbId, MobilePhone mb);
}
