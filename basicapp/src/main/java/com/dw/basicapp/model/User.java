package com.dw.basicapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_name")
    String userName;
    @Column(name = "password")
    String password;
    @Column(name = "email")
    String email;
    @Column(name = "real_name")
    String realName;
    @Column(name = "role")
    String role;
    @Column(name = "created_at")
    LocalDateTime createdAt;
}