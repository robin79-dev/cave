package fr.eni.cave.entities;

import jakarta.persistence.*;

@Entity
public class Bouteille {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nom;
    private boolean petillant;
    private String millesime;
    private int quantite;


    public Bouteille() {

    }

    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isPetillant() {
        return petillant;
    }

    public void setPetillant(boolean petillant) {
        this.petillant = petillant;
    }

    public String getMillesime() {
        return millesime;
    }

    public void setMillesime(String millesime) {
        this.millesime = millesime;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
