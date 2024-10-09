package org.cours.jpa.repository;
import java.util.List;
import org.cours.jpa.modele.Cours;
import org.cours.jpa.modele.Module;
import org.springframework.data.repository.CrudRepository;



public interface CoursRepository extends CrudRepository<Cours, Integer> {

    List<Cours> findByModuleId(Integer moduleId);
}