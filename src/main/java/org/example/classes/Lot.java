package org.example.classes;

import java.util.ArrayList;
import java.util.List;

public class Lot extends Article {
    private int quantite;
    private int remise;

    public Lot(int quantite, int remise, long reference) {
        super(reference);

        this.quantite = quantite;
        this.remise = remise;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getRemise() {
        return remise;
    }

    public void setRemise(int remise) {
        this.remise = remise;
    }
}
