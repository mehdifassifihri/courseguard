package com.example.gestioncours.services;

import com.example.gestioncours.entities._Module;

import java.util.List;

public interface ModuleServices {
    List<_Module> getAllModules();
    _Module addModule(_Module module);
    void deleteModule(Integer id);

}
