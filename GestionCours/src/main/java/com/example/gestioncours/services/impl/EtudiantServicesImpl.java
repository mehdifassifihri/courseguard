package com.example.gestioncours.services.impl;

import com.example.gestioncours.entities.Classe;
import com.example.gestioncours.entities.Etudiant;
import com.example.gestioncours.models.EtudiantRequest;
import com.example.gestioncours.repository.ClasseRepository;
import com.example.gestioncours.repository.EtudiantRepository;
import com.example.gestioncours.services.EtudiantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantServicesImpl implements EtudiantServices {
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    ClasseRepository classeRepository;
    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(EtudiantRequest etudiantRequest) {
        Etudiant etudiant = new Etudiant();
        int classeId = Integer.parseInt(etudiantRequest.getClasseId());
        Optional<Classe> classe = classeRepository.findById(classeId);
        if (classe.isPresent()){
            etudiant.setClasse(classe.get());
        }
        etudiant.setName(etudiantRequest.getName());
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Integer id) {
        etudiantRepository.deleteById(id);
    }
}
