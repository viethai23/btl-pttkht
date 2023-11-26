package com.example.shoppingonline.DAO.ClotheDAO;

import com.example.shoppingonline.Model.Product.Clothe;

public interface ClotheDAO {
    Clothe getClothe(int clotheId);
    Clothe addClothe(Clothe c);
    Clothe editClothe(int clotheId, Clothe c);
}
