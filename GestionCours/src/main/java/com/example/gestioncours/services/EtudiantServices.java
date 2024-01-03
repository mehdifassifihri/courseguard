package com.example.gestioncours.services;

import com.example.gestioncours.entities.Etudiant;

import com.example.gestioncours.models.EtudiantRequest;

import java.util.List;

public interface EtudiantServices {
    List<Etudiant> getAllEtudiants();
    Etudiant addEtudiant(EtudiantRequest etudiantRequest);
    void deleteEtudiant(Integer id);
}
