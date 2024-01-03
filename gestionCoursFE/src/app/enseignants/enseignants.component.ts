import { Component } from '@angular/core';
import { CoursService } from '../services/cours.service';
import { EnseignantsService } from '../services/enseignants.service';
import { Enseignant } from '../models/Enseignant';

@Component({
  selector: 'app-enseignants',
  templateUrl: './enseignants.component.html',
  styleUrls: ['./enseignants.component.css'],
})
export class EnseignantsComponent {
  enseignants: Enseignant[] = [];
  constructor(private enseignantService: EnseignantsService) {}
  ngOnInit(): void {
    this.enseignantService.getAllEnseignants().subscribe((data) => {
      this.enseignants = data;
    });
  }
}
