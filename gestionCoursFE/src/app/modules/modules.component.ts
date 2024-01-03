import { Component } from '@angular/core';
import { Module } from '../models/Module';
import { ModulesService } from '../services/modules.service';

@Component({
  selector: 'app-modules',
  templateUrl: './modules.component.html',
  styleUrls: ['./modules.component.css'],
})
export class ModulesComponent {
  modules: Module[] = [];
  constructor(private moduleServices: ModulesService) {}
  ngOnInit(): void {
    this.moduleServices.getAllModules().subscribe((data) => {
      this.modules = data;
    });
  }
}
