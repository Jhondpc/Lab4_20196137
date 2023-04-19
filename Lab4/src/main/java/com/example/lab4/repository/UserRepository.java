package com.example.lab4.repository;

import com.example.lab4.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findByUsername(String n);
}
