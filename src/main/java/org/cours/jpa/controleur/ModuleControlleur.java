package org.cours.jpa.controleur;
import org.cours.jpa.modele.Module;
import org.cours.jpa.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ModuleControlleur {
    @Autowired
    private ModuleService moduleService;

    @GetMapping("/modules")
    public List<Module> getModules() {
        return moduleService.getAllModules();
    }

    @GetMapping("/modules/{id}")
    public Optional<Module> getModule(@PathVariable Integer id){
        return moduleService.getModule(id);
    }
    @PostMapping("/modules")
    public void ajouterModule(@RequestBody Module module) {
        moduleService.ajouterModule(module);
    }
    @PutMapping("/modules/{id}")
    public void modifierModule(@RequestBody Module module, @PathVariable Integer id) {
        moduleService.modifierModule(id, module);
    }
    @DeleteMapping("/modules/{id}")
    public void supprimerModule(@PathVariable Integer id) {
        moduleService.supprimerModule(id);
    }



}