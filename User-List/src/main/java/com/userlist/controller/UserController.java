package com.userlist.controller;

import com.userlist.model.User;
import com.userlist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController //Creating the API
@RequestMapping(value = "/api") //For HTTP Requests
public class UserController {



    @Autowired
    private UserRepository userRepository;


    @GetMapping(value = "users")
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
