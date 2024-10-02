package org.cours.jpa.controleur;

import org.cours.jpa.modele.module;
import org.cours.jpa.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/modules")
public class ModuleControlleur {

    @Autowired
    private ModuleService moduleService;

    // Récupérer tous les modules
    @GetMapping
    public List<module> getModules() {
        return moduleService.getAllModules();
    }

    // Récupérer un module par son id
    @GetMapping("/{id}")
    public Optional<module> getModule(@PathVariable Integer id) {
        return moduleService.getModule(id);
    }

    // Ajouter un nouveau module
    @PostMapping
    public void ajouterModule(@RequestBody module m) {
        moduleService.ajouterModule(m);
    }

    // Modifier un module existant
    @PutMapping("/{id}")
    public void modifierModule(@RequestBody module m, @PathVariable Integer id) {
        moduleService.modifierModule(id, m);
    }

    // Supprimer un module par son id
    @DeleteMapping("/{id}")
    public void supprimerModule(@PathVariable Integer id) {
        moduleService.supprimerModule(id);
    }
}
