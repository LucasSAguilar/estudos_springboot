package com.example.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.estudos.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
