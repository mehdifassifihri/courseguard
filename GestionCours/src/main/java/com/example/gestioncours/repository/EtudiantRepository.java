package com.example.gestioncours.repository;

import com.example.gestioncours.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
    @Query("SELECT e FROM Etudiant e WHERE e.classe.id = :classeId")
    ResponseEntity<List<Etudiant>> getEtudiantsByClasseId(@Param("classeId") int classeId);
}
