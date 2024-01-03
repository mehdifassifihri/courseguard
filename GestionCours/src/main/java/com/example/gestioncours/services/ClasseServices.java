package com.example.gestioncours.services;

import com.example.gestioncours.entities.Classe;
import com.example.gestioncours.entities.Etudiant;
import com.example.gestioncours.models.EtudiantRequest;

import java.util.List;

public interface ClasseServices {
    List<Classe> getAllClasses();
    Classe addClasse(Classe classe);
    void deleteClasse(Integer id);
}
