package org.cours.jpa.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.cours.jpa.modele.Cours;
import org.cours.jpa.modele.Module;
import org.cours.jpa.repository.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CoursService {
    @Autowired
    private CoursRepository coursRepository;

    public List<Cours> getAllCours(Integer moduleId) {
        List<Cours> cours=new ArrayList<>();
        coursRepository.findByModuleId(moduleId).forEach(c->cours.add(c));
        return cours;
    }

    public Optional<Cours> getCours(Integer id) {
        return coursRepository.findById(id);
    }
    public void ajouterCours(Cours cours) {
        coursRepository.save(cours);
    }
    public void modifierCours(Cours cours) {
        coursRepository.save(cours); //ici save dans le rôle de la mise à jour
    }
    public void supprimerCours(Integer id) {
        coursRepository.deleteById(id);
    }

}