package com.example.ishiki.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter
public class UserDTO {
    private long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String subscriptionType;
    private Date createdAt = new Date();
    private String role;


}