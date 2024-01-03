package com.example.gestioncours.controllers;

import com.example.gestioncours.entities.Cours;
import com.example.gestioncours.entities.Enseignant;
import com.example.gestioncours.models.CoursRequest;
import com.example.gestioncours.services.impl.CoursServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cours")
@CrossOrigin
public class CoursControllers {
    @Autowired
    CoursServicesImpl coursServices;
    @GetMapping()
    List<Cours> getAllCours(){
        return coursServices.getAllCours();
    }

    @PostMapping()
    Cours addCours(@RequestBody CoursRequest coursRequest){
        return coursServices.addCours(coursRequest);
    }

    @DeleteMapping("/{id}")
    void deleteCours (@PathVariable int id){
        coursServices.deleteCours(id);
    }
}
