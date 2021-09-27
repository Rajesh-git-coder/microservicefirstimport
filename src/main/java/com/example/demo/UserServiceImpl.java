package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
private UserRepository repo;
	//@Autowired
//private BCryptPasswordEncoder encoder;	
	public Integer usersave(User user) {
		//user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user).getId();
	}

	
	public Optional<User> getUser(String email) {
		
		return repo.findbyEmail(email);
	}

}
