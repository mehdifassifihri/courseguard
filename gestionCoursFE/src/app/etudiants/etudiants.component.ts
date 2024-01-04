import { Component } from '@angular/core';
import { EtudiantsService } from '../services/etudiants.service';
import { Etudiant } from '../models/Etudiant';
import { ClassesService } from '../services/classes.service';
import { Classe } from '../models/Classe';

@Component({
  selector: 'app-etudiants',
  templateUrl: './etudiants.component.html',
  styleUrls: ['./etudiants.component.css'],
})
export class EtudiantsComponent {
  selectedClassId: any;
  studentName: string = '';
  etudiants: Etudiant[] = [];
  classes: Classe[] = [];
  constructor(
    private etudiantService: EtudiantsService,
    private classeServices: ClassesService
  ) {}
  ngOnInit(): void {
    this.etudiantService.getEtudiants().subscribe((data) => {
      this.etudiants = data;
    });
    this.classeServices.getAllClasses().subscribe((data) => {
      this.classes = data;
    });
  }

  Submit(): void {
    this.etudiantService
      .addEtudiant(this.studentName, this.selectedClassId)
      .subscribe((data) =>
        this.etudiantService.getEtudiants().subscribe((data) => {
          this.etudiants = data;
        })
      );
  }
}
