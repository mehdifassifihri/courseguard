import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ModulesComponent } from './modules/modules.component';
import { ClassesComponent } from './classes/classes.component';
import { EtudiantsComponent } from './etudiants/etudiants.component';
import { EnseignantsComponent } from './enseignants/enseignants.component';
import { CoursComponent } from './cours/cours.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'modules', component: ModulesComponent },
  { path: 'cours', component: CoursComponent },
  { path: 'classes', component: ClassesComponent },
  { path: 'etudiants', component: EtudiantsComponent },
  { path: 'enseignants', component: EnseignantsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
