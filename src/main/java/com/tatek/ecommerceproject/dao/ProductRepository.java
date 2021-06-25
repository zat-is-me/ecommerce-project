package com.tatek.ecommerceproject.dao;

import com.tatek.ecommerceproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
