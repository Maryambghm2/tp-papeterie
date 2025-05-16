package org.example.classes;

public class Ramette  extends ArticleUnitaire {
private double grammage;

    public Ramette (long reference, String nom, int prixUnitaire, double grammage) {
    super(reference, nom, prixUnitaire);
    this.grammage = grammage;
}

public double getGrammage () {
        return grammage;
}

public void setGrammage(double grammage) {
        this.grammage = grammage;
}


}
