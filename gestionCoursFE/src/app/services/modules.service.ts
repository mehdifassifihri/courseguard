import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Injector } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Module } from '../models/Module';

@Injectable({
  providedIn: 'root',
})
export class ModulesService {
  private apiUrl = 'http://localhost:8080/module'; // Replace with your API URL

  constructor(private http: HttpClient) {}

  getAllModules(): Observable<Module[]> {
    return this.http.get<Module[]>(`${this.apiUrl}`);
  }

  
}
