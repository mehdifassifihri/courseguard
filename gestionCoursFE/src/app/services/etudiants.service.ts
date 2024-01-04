import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Injector } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Etudiant } from '../models/Etudiant';
import { Classe } from '../models/Classe';

@Injectable({
  providedIn: 'root',
})
export class EtudiantsService {
  private apiUrl = 'http://localhost:8080/etudiant'; // Replace with your API URL

  constructor(private http: HttpClient) {}

  getEtudiants(): Observable<Etudiant[]> {
    return this.http.get<Etudiant[]>(`${this.apiUrl}`);
  }

  addEtudiant(studentName: string, classeId: any): Observable<Classe> {
    const body = { name: studentName, classeId: classeId };
    return this.http.post<Classe>(this.apiUrl, body);
  }
}
