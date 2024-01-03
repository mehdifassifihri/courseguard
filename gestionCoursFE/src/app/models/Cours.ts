import { Classe } from './Classe';
import { Enseignant } from './Enseignant';
import { Module } from './Module';

export interface Cours {
  id: number;
  volume_horraire: String;
  date: String;
  module: Module;
  classe: Classe;
  enseignant: Enseignant;
}
