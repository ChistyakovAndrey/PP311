package com.andrey.spring_boot.dao;

import com.andrey.spring_boot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);

    User getUserById(Integer id);

    void deleteUserById(int id);
}
