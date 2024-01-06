package com.diogo.buyeasy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diogo.buyeasy.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
