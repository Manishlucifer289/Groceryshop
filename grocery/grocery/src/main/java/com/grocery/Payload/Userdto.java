package com.grocery.Payload;

import lombok.Data;

@Data
public class Userdto {
    private long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String role;

}