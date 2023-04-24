package com.example.lab4.repository;

import com.example.lab4.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Query(nativeQuery = true,value = "select * from mydb.user where email = ?1 and password = ?2")
    Optional<User> buscarUser(String email, String password);

}
