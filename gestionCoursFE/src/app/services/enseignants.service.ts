import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Injector } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Enseignant } from '../models/Enseignant';

@Injectable({
  providedIn: 'root',
})
export class EnseignantsService {
  private apiUrl = 'http://localhost:8080/enseignant'; // Replace with your API URL

  constructor(private http: HttpClient) {}

  getAllEnseignants(): Observable<Enseignant[]> {
    return this.http.get<Enseignant[]>(`${this.apiUrl}`);
  }
}
