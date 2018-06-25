package com.example.dao;

import com.example.entities.User;

public interface UserDao {

    User getByEmail(String email);
    boolean add(User user);
}
