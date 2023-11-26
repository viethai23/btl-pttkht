package com.example.shoppingonline.Controller;

import com.example.shoppingonline.DAO.ClotheDAO.ClotheDAO;
import com.example.shoppingonline.Model.Product.Clothe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clothes")
@CrossOrigin
public class ClotheController {

    @Autowired
    private ClotheDAO clotheDAO;

    @GetMapping("/{clotheId}")
    public Clothe getClothe(@PathVariable int clotheId) {
        return clotheDAO.getClothe(clotheId);
    }

    @PostMapping
    public Clothe addClothe(@RequestBody Clothe clothe) {
        return clotheDAO.addClothe(clothe);
    }

    @PutMapping("/{clotheId}")
    public Clothe editClothe(@PathVariable int clotheId, @RequestBody Clothe clothe) {
        return clotheDAO.editClothe(clotheId, clothe);
    }
}
