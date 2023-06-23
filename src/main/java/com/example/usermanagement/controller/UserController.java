package com.example.usermanagement.controller;

import com.example.usermanagement.model.User;
import com.example.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/getUser/{userId}")
    public Optional<User> getUser(@PathVariable Long userId) {
        return userRepository.findById(userId);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @PutMapping("/updateUserInfo")
    public User updateUserInfo(@RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userRepository.deleteById(userId);
    }
}

