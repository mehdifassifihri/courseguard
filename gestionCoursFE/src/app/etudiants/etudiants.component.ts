import { Component } from '@angular/core';
import { EtudiantsService } from '../services/etudiants.service';
import { Etudiant } from '../models/Etudiant';

@Component({
  selector: 'app-etudiants',
  templateUrl: './etudiants.component.html',
  styleUrls: ['./etudiants.component.css'],
})
export class EtudiantsComponent {
  etudiants: Etudiant[] = [];
  constructor(private etudiantService: EtudiantsService) {}
  ngOnInit(): void {
    this.etudiantService.getEtudiants().subscribe((data) => {
      this.etudiants = data;
    });
  }
}
