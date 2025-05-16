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



    public static void main(String[] args) {
        Stylo stylo = new Stylo(486572003, "Stylo", 2, "bleu");
    }
}

