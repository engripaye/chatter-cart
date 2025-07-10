package com.engripaye.chatter_cart.UserService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    @Id @GeneratedValue private Long id;
    private String username;
    private String password;
    private String role; // ADMIN, CUSTOMER





}
