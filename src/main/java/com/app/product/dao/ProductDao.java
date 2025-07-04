package com.app.product.dao;

import com.app.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductDao extends JpaRepository<Product, Integer> {
}
