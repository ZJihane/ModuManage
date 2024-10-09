package org.cours.jpa.modele;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Module {

    // Getters et Setters
    @Id
    private int id;

    private String nom;

    private String description;

    public Module(int id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }

    public Module() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
