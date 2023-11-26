package com.example.shoppingonline.Repository;

import com.example.shoppingonline.Model.Product.Clothe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClotheRepository extends JpaRepository<Clothe, Integer> {
}
