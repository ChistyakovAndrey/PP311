package com.andrey.spring_boot.dao;

import com.andrey.spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);

    User getUserById(Integer id);

    void deleteUserById(int id);
}
