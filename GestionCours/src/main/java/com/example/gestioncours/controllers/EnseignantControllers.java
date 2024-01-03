package com.example.gestioncours.controllers;

import com.example.gestioncours.entities.Enseignant;
import com.example.gestioncours.entities.Etudiant;
import com.example.gestioncours.models.EtudiantRequest;
import com.example.gestioncours.services.impl.EnseignantServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enseignant")
@CrossOrigin()
public class EnseignantControllers {
    @Autowired
    EnseignantServicesImpl enseignantServices;

    @GetMapping()
    List<Enseignant> getAllEnseignant(){
        return enseignantServices.getAllEnseignant();
    }

    @PostMapping()
    Enseignant addEnseignant(@RequestBody Enseignant enseignant){
        return enseignantServices.addEnseignant(enseignant);
    }

    @DeleteMapping("/{id}")
    void deleteModule (@PathVariable int id){
        enseignantServices.deleteEnseignant(id);
    }
}
