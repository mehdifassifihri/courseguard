import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'gestionCoursFE';
  paths: Array<any> = [
    { name: 'Gestion de cours', route: '/cours' },
    { name: 'Gestion de modules', route: '/modules' },
    { name: "Gestion d'enseignants", route: '/enseignants' },
    { name: 'Gestion de classes', route: '/classes' },
    { name: "Gestion d'etudiants", route: '/etudiants' },
    // Add more stocks as needed
  ];
  currentPath: any = this.paths[0];

  setCurrentPath(path: any) {
    this.currentPath = path;
    console.log(this.currentPath);
    console.log('wewe');
  }
}
