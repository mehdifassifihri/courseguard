package com.example.gestioncours.services.impl;

import com.example.gestioncours.entities._Module;
import com.example.gestioncours.repository.ModuleRepository;
import com.example.gestioncours.services.ModuleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ModuleServicesImpl implements ModuleServices {
    @Autowired
    ModuleRepository moduleRepository;

    @Override
    public List<_Module> getAllModules() {
        return moduleRepository.findAll();
    }

    @Override
    public _Module addModule(_Module module) {
        return moduleRepository.save(module);
    }

    @Override
    public void deleteModule(Integer id) {
        moduleRepository.deleteById(id);
    }
}
