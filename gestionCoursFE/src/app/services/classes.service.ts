import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';

import { Injector } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Classe } from '../models/Classe';

@Injectable({
  providedIn: 'root',
})
export class ClassesService {
  private apiUrl = 'http://localhost:8080/classe'; // Replace with your API URL

  constructor(private http: HttpClient) {}

  getAllClasses(): Observable<Classe[]> {
    return this.http.get<Classe[]>(`${this.apiUrl}`);
  }
}
