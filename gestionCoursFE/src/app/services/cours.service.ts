import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { Injector } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Cours } from '../models/Cours';

@Injectable({
  providedIn: 'root',
})
export class CoursService {
  private apiUrl = 'http://localhost:8080/cours'; // Replace with your API URL

  constructor(private http: HttpClient) {}

  getAllCours(): Observable<Cours[]> {
    return this.http.get<Cours[]>(`${this.apiUrl}`);
  }

  addCours(coursData: {
    volume_horraire: any;
    date: string;
    classeId: any;
    moduleId: any;
    enseignantId: any;
  }): Observable<Cours> {
    return this.http.post<Cours>(this.apiUrl, coursData);
  }
}
