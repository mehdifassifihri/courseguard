package com.example.gestioncours.repository;

import com.example.gestioncours.entities._Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ModuleRepository extends JpaRepository<_Module,Integer> {
}
