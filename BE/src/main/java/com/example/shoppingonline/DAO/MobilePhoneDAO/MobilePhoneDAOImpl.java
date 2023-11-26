package com.example.shoppingonline.DAO.MobilePhoneDAO;

import com.example.shoppingonline.Model.Product.MobilePhone;
import com.example.shoppingonline.Repository.MobilePhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobilePhoneDAOImpl implements MobilePhoneDAO {

    @Autowired
    private MobilePhoneRepository mobilePhoneRepository;

    @Override
    public MobilePhone getMobilePhone(int mbId) {
        return mobilePhoneRepository.findById(mbId).orElse(null);
    }

    @Override
    public MobilePhone addMobilePhone(MobilePhone mb) {
        return mobilePhoneRepository.save(mb);
    }

    @Override
    public MobilePhone editMobilePhone(int mbId, MobilePhone mb) {
        MobilePhone existingMobilePhone = getMobilePhone(mbId);
        if (existingMobilePhone != null) {
            existingMobilePhone.setName(mb.getName());
            existingMobilePhone.setType(mb.getType());
            existingMobilePhone.setScreenSize(mb.getScreenSize());
            existingMobilePhone.setStorageCapacity(mb.getStorageCapacity());
            existingMobilePhone.setBrand(mb.getBrand());
            return mobilePhoneRepository.save(existingMobilePhone);
        }
        return null;
    }
}
