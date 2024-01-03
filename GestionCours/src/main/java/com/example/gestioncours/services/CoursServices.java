package com.example.gestioncours.services;

import com.example.gestioncours.entities.Classe;
import com.example.gestioncours.entities.Cours;
import com.example.gestioncours.models.CoursRequest;

import java.util.List;

public interface CoursServices {
    List<Cours> getAllCours();
    Cours addCours(CoursRequest coursRequest);
    void deleteCours(Integer id);

}
