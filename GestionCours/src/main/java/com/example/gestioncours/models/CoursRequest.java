package com.example.gestioncours.models;

import com.example.gestioncours.entities.Classe;
import com.example.gestioncours.entities.Enseignant;
import com.example.gestioncours.entities._Module;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CoursRequest {
    private int volume_horraire;
    private LocalDateTime date;

    private int classeId;

    private int moduleId;

    private int enseignantId;
}
