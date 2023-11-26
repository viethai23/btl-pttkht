package com.example.shoppingonline.Repository;

import com.example.shoppingonline.Model.Product.MobilePhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobilePhoneRepository extends JpaRepository<MobilePhone, Integer> {
}
