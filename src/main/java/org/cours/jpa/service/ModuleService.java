package org.cours.jpa.service;

import org.cours.jpa.modele.module;
import org.cours.jpa.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    // Ajouter un module
    public void ajouterModule(module m) {
        moduleRepository.save(m);
    }

    // Récupérer tous les modules
    public List<module> getAllModules() {
        List<module> modules = new ArrayList<>();
        moduleRepository.findAll().forEach(modules::add);
        return modules;
    }

    // Récupérer un module par son id
    public Optional<module> getModule(Integer id) {
        return moduleRepository.findById(id);
    }

    // Modifier un module existant
    public void modifierModule(Integer id, module m) {
        if (moduleRepository.existsById(id)) {
            m.setId(id);
            moduleRepository.save(m);
        }
    }

    // Supprimer un module par son id
    public void supprimerModule(Integer id) {
        moduleRepository.deleteById(id);
    }
}
