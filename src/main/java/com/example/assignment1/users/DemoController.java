package com.example.assignment1.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private UserGateway userGateway;

    @GetMapping("/call/{id}")
    public UserResponse callUserAPI(@PathVariable int id) {
        return userGateway.getUserById(id);
    }
}
