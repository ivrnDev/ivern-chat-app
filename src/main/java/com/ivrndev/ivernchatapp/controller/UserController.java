package com.ivrndev.ivernchatapp.controller;

import com.ivrndev.ivernchatapp.model.User;
import com.ivrndev.ivernchatapp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public User createUser(@RequestBody  User user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getUser() {
        return userService.getAllUsers();
    }

}
