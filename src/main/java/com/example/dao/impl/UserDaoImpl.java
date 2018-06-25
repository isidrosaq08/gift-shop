package com.example.dao.impl;

import com.example.dao.UserDao;
import com.example.entities.User;
import org.springframework.stereotype.Repository;

/**
 * Allow to get access to user data
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public User getByEmail(String email) {
        String selectQuery = "FROM User WHERE email = :email";
        try {
            return null;
        }
        catch(Exception ex) {
            return null;
        }

    }

    @Override
    public boolean add(User user) {
        try {
            return true;
        }
        catch(Exception ex) {
            return false;
        }
    }
}
