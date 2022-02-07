package com.erman.crud.crud.repositories;

import com.erman.crud.crud.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
