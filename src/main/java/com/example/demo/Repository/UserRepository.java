package com.example.demo.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.User;

public interface UserRepository extends JpaRepository<User,Integer>{
@Query("select u from User u where email=:email")	
Optional<User> findbyEmail(String email);

}
