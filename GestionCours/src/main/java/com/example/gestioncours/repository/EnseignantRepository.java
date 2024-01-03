package com.example.gestioncours.repository;

import com.example.gestioncours.entities.Enseignant;
import com.example.gestioncours.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnseignantRepository extends JpaRepository<Enseignant,Integer> {
}
