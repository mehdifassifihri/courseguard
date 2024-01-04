import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'gestionCoursFE';
  paths: Array<any> = [
    { name: 'Gestion de cours', route: '/cours', logo: 'assets/courses.png' },
    {
      name: 'Gestion de modules',
      route: '/modules',
      logo: 'assets/modules.png',
    },
    {
      name: "Gestion d'enseignants",
      route: '/enseignants',
      logo: 'assets/teacher.png',
    },
    {
      name: 'Gestion de classes',
      route: '/classes',
      logo: 'assets/classes.png',
    },
    {
      name: "Gestion d'etudiants",
      route: '/etudiants',
      logo: 'assets/student.png',
    },
    // Add more stocks as needed
  ];
  currentPath: any = this.paths[0];

  setCurrentPath(path: any) {
    this.currentPath = path;
    console.log(this.currentPath);
    console.log('wewe');
  }
}
