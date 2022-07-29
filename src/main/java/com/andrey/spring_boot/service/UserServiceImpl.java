package com.andrey.spring_boot.service;

import com.andrey.spring_boot.dao.UserDaoImpl;
import com.andrey.spring_boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDaoImpl userDao;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        System.out.println("user.name: " + user.getId());
        userDao.addUser(user);
    }
    @Override
    @Transactional
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void deleteUserById(Integer id) {
        userDao.deleteUserById(id);
    }
}
