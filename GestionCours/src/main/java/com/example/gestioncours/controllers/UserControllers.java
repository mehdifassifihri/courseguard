package com.example.gestioncours.controllers;

import com.example.gestioncours.entities.User;
import com.example.gestioncours.entities._Module;
import com.example.gestioncours.services.impl.ModuleServicesImpl;
import com.example.gestioncours.services.impl.UserServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControllers {
    @Autowired
    UserServicesImpl userServices;
    @GetMapping()
    List<User> getAllUsers(){
        return userServices.getAllUsers();
    }
    @PostMapping()
    User addUser(@RequestBody User user) {
        return userServices.addUser(user);
    }
    @DeleteMapping("/{id}")
    void deleteModule (@PathVariable int id){
        userServices.deleteUser(id);
    }
}
