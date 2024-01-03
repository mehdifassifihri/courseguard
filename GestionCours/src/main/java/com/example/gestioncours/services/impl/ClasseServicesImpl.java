package com.example.gestioncours.services.impl;

import com.example.gestioncours.entities.Classe;
import com.example.gestioncours.entities.Etudiant;
import com.example.gestioncours.repository.ClasseRepository;
import com.example.gestioncours.services.ClasseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasseServicesImpl implements ClasseServices {

    @Autowired
    ClasseRepository classeRepository;


    @Override
    public List<Classe> getAllClasses() {
        return classeRepository.findAll();
    }

    @Override
    public Classe addClasse(Classe classe) {
        return classeRepository.save(classe);
    }

    @Override
    public void deleteClasse(Integer id) {
    classeRepository.deleteById(id);
    }
}
