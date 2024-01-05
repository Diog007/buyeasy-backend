package com.diogo.buyeasy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diogo.buyeasy.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
