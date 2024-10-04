package com.wizaye.SpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wizaye.SpringApp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
