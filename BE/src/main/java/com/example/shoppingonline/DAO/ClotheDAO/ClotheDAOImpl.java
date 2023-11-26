package com.example.shoppingonline.DAO.ClotheDAO;

import com.example.shoppingonline.Model.Product.Clothe;
import com.example.shoppingonline.Repository.ClotheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClotheDAOImpl implements ClotheDAO {

    @Autowired
    private ClotheRepository clotheRepository;

    @Override
    public Clothe getClothe(int clotheId) {
        return clotheRepository.findById(clotheId).orElse(null);
    }

    @Override
    public Clothe addClothe(Clothe c) {
        return clotheRepository.save(c);
    }

    @Override
    public Clothe editClothe(int clotheId, Clothe c) {
        Clothe existingClothe = getClothe(clotheId);
        if (existingClothe != null) {
            existingClothe.setName(c.getName());
            existingClothe.setColor(c.getColor());
            existingClothe.setSize(c.getSize());
            existingClothe.setMaterial(c.getMaterial());
            existingClothe.setGender(c.getGender());
            existingClothe.setProducer(c.getProducer());
            return clotheRepository.save(existingClothe);
        }
        return null;
    }
}
