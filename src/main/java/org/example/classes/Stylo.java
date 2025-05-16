package org.example.classes;

public class Stylo extends ArticleUnitaire {
    private String couleur;

    public Stylo(long reference, String nom, int prixUnitaire, String couleur) {
        super(reference, nom, prixUnitaire);
        this.couleur = couleur;

    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}

