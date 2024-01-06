package com.diogo.buyeasy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diogo.buyeasy.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
