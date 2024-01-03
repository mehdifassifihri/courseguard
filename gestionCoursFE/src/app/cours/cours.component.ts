import { Component, OnInit } from '@angular/core';
import { CoursService } from '../services/cours.service';
import { EnseignantsService } from '../services/enseignants.service';
import { Module } from '../models/Module';
import { ModulesService } from '../services/modules.service';
import { Enseignant } from '../models/Enseignant';
import { Classe } from '../models/Classe';
import { ClassesService } from '../services/classes.service';
import { Cours } from '../models/Cours';

@Component({
  selector: 'app-cours',
  templateUrl: './cours.component.html',
  styleUrls: ['./cours.component.css'],
})
export class CoursComponent implements OnInit {
  selectedModuleId: any;
  selectedEnseignantId: any;
  selectedClasseId: any;
  selectedDate: string = '';

  modules: Module[] = [];
  enseignants: Enseignant[] = [];
  classes: Classe[] = [];
  cours: Cours[] = [];

  constructor(
    private modulesService: ModulesService,
    private enseignantService: EnseignantsService,
    private coursService: CoursService,
    private classeService: ClassesService
  ) {}

  submit() {
    const coursData = {
      volume_horraire: 2,
      date: this.selectedDate,
      classeId: this.selectedClasseId,
      moduleId: this.selectedModuleId,
      enseignantId: this.selectedEnseignantId,
    };

    this.coursService.addCours(coursData).subscribe((data) => {
      console.log('Added');
      this.coursService.getAllCours().subscribe((data) => {
        this.cours = data;
      });
    });
  }

  plainFooter = 'plain extra footer';
  footerRender = (): string => 'extra footer';

  ngOnInit(): void {
    this.modulesService.getAllModules().subscribe((data) => {
      this.modules = data;
    });

    this.enseignantService.getAllEnseignants().subscribe((data) => {
      this.enseignants = data;
    });

    this.classeService.getAllClasses().subscribe((data) => {
      this.classes = data;
    });

    this.coursService.getAllCours().subscribe((data) => {
      this.cours = data;
    });
  }
}
