package com.diogo.buyeasy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diogo.buyeasy.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
