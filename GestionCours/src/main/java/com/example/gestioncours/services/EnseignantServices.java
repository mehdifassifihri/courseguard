package com.example.gestioncours.services;

import com.example.gestioncours.entities.Enseignant;
import com.example.gestioncours.entities.Etudiant;

import java.util.List;

public interface EnseignantServices {
    List<Enseignant> getAllEnseignant();
    Enseignant addEnseignant(Enseignant enseignant);
    void deleteEnseignant(Integer id);
}
