package com.example.springboot_jpa_demo.Service;

import com.example.springboot_jpa_demo.Entity.User;

import java.util.List;

public interface userService{
    User createUser(User user);
    User getUserById(Long userId);
    List<User> getAllUser();
    User updateUser(User user);
    void deleteUser(Long userId);


}

