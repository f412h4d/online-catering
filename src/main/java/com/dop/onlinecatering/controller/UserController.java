package com.dop.onlinecatering.controller;

import com.dop.onlinecatering.model.User;
import com.dop.onlinecatering.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")           //todo might not be use full later
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public String getUsers(){
        return "hi";
    }
}
