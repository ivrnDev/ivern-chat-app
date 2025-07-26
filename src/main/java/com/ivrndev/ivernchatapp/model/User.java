package com.ivrndev.ivernchatapp.model;

import lombok.Data;

@Data
public class User {
    private Long userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}
