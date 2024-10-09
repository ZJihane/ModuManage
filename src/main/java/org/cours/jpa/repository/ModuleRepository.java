package org.cours.jpa.repository;

import org.cours.jpa.modele.Module;
import org.springframework.data.repository.CrudRepository;


public interface ModuleRepository extends CrudRepository<Module, Integer> {
}
