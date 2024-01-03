package com.example.gestioncours.services.impl;

import com.example.gestioncours.entities.Classe;
import com.example.gestioncours.entities.Cours;
import com.example.gestioncours.entities.Enseignant;
import com.example.gestioncours.entities._Module;
import com.example.gestioncours.models.CoursRequest;
import com.example.gestioncours.repository.ClasseRepository;
import com.example.gestioncours.repository.CoursRepository;
import com.example.gestioncours.repository.EnseignantRepository;
import com.example.gestioncours.repository.ModuleRepository;
import com.example.gestioncours.services.CoursServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursServicesImpl implements CoursServices {
    @Autowired
    CoursRepository  coursRepository;
    @Autowired
    ModuleRepository moduleRepository;
    @Autowired
    EnseignantRepository enseignantRepository;
    @Autowired
    ClasseRepository classeRepository;
    @Override
    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public Cours addCours(CoursRequest coursRequest) {
        Cours cours = new Cours();
        int classeId = coursRequest.getClasseId();
        int enseignantId = coursRequest.getEnseignantId();
        int moduleId = coursRequest.getModuleId();
        Optional<Classe> classe = classeRepository.findById(classeId);
        if (classe.isPresent()){
            cours.setClasse(classe.get());
        }
        Optional<Enseignant> enseignant = enseignantRepository.findById(enseignantId);
        if (enseignant.isPresent()){
            cours.setEnseignant(enseignant.get());
        }
        Optional<_Module> module = moduleRepository.findById(moduleId);
        if (module.isPresent()){
            cours.setModule(module.get());
        }
        cours.setDate(coursRequest.getDate());
        cours.setVolume_horraire(coursRequest.getVolume_horraire());
        return coursRepository.save(cours);
    }


    @Override
    public void deleteCours(Integer id) {
        coursRepository.deleteById(id);
    }
}
