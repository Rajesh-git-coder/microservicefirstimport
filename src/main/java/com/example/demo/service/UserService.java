package com.example.demo.service;

import java.util.Optional;

import com.example.demo.Model.User;

public interface UserService {
public Integer usersave(User user);
public Optional<User> getUser(String email);
}
