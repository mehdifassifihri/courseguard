package com.example.gestioncours.services.impl;

import com.example.gestioncours.entities.Enseignant;
import com.example.gestioncours.entities.Etudiant;
import com.example.gestioncours.repository.EnseignantRepository;
import com.example.gestioncours.services.EnseignantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EnseignantServicesImpl implements EnseignantServices {
    @Autowired
    EnseignantRepository enseignantRepository;
    @Override
    public List<Enseignant> getAllEnseignant() {
        return enseignantRepository.findAll();
    }

    @Override
    public Enseignant addEnseignant(Enseignant enseignant) {
        return enseignantRepository.save(enseignant);
    }

    @Override
    public void deleteEnseignant(Integer id) {
        enseignantRepository.deleteById(id);
    }
}
