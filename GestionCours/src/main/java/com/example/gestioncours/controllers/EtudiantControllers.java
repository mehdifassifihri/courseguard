package com.example.gestioncours.controllers;

import com.example.gestioncours.entities.Etudiant;
import com.example.gestioncours.models.EtudiantRequest;
import com.example.gestioncours.services.EtudiantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/etudiant")
@CrossOrigin
public class EtudiantControllers {
    @Autowired
    EtudiantServices etudiantServices;

    @GetMapping()
    List<Etudiant> getAllEtudiants(){
        return etudiantServices.getAllEtudiants();
    }

    @PostMapping()
    Etudiant addEtudiant(@RequestBody EtudiantRequest etudiantRequest){
        return etudiantServices.addEtudiant(etudiantRequest);
    }

    @DeleteMapping("/{id}")
    void deleteModule (@PathVariable int id){
        etudiantServices.deleteEtudiant(id);
    }
}
