import { Component, OnInit } from '@angular/core';
import { Classe } from '../models/Classe';
import { ClassesService } from '../services/classes.service';

@Component({
  selector: 'app-classes',
  templateUrl: './classes.component.html',
  styleUrls: ['./classes.component.css'],
})
export class ClassesComponent implements OnInit {
  classes: Classe[] = [];
  constructor(private classeService: ClassesService) {}
  ngOnInit(): void {
    this.classeService.getAllClasses().subscribe((data) => {
      this.classes = data;
    });
  }
}
