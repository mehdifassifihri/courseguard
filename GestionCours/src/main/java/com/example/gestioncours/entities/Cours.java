package com.example.gestioncours.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int volume_horraire;
    private LocalDateTime date;
    @ManyToOne
    private Classe classe;
    @ManyToOne
    private _Module module;
    @ManyToOne
    private Enseignant enseignant;
    
}
