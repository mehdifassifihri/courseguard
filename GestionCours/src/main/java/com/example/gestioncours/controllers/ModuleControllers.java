package com.example.gestioncours.controllers;

import com.example.gestioncours.entities._Module;
import com.example.gestioncours.services.impl.ModuleServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/module")
@CrossOrigin
public class ModuleControllers {
    @Autowired
    ModuleServicesImpl moduleServices;
    @GetMapping()
    List<_Module> getAllModules(){
        return moduleServices.getAllModules();
    }
    @PostMapping()
    _Module addModule(@RequestBody _Module module){
        return moduleServices.addModule(module);
    }
    @DeleteMapping("/{id}")
    void deleteModule (@PathVariable int id){
        moduleServices.deleteModule(id);
    }
}
