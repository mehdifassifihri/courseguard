package com.example.gestioncours.services;

import com.example.gestioncours.entities.User;
import com.example.gestioncours.entities._Module;

import java.util.List;

public interface UserServices {
    List<User> getAllUsers();
    User addUser(User user);
    void deleteUser(Integer id);
}
