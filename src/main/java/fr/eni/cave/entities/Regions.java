package fr.eni.cave.entities;

import jakarta.persistence.*;

@Entity
public class Regions {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String Nom;

    public Regions() {

    }

    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }
}
