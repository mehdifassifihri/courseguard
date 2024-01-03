package com.example.gestioncours.controllers;

import com.example.gestioncours.entities.Classe;
import com.example.gestioncours.services.impl.ClasseServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classe")
@CrossOrigin
public class ClasseControllers {
    @Autowired
    ClasseServicesImpl classeServices;
    @GetMapping()
    List<Classe> getAllClasses(){
        return classeServices.getAllClasses();
    }

    @PostMapping()
    Classe addClasse(@RequestBody Classe classe){
        return classeServices.addClasse(classe);
    }

    @DeleteMapping("/{id}")
    void deleteClasse (@PathVariable int id){
        classeServices.deleteClasse(id);
    }
}
