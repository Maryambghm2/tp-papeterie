package org.example.classes;

public class ArticleUnitaire extends Article {
    private String nom;
    private int prixUnitaire;

    public ArticleUnitaire(long reference, String nom, int prixUnitaire) {
        super(reference);
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(int prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }


}
