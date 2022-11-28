package com.devoir;

import java.util.ArrayList;
import java.util.List;

public class Societe {

    private long id;
    private String raison_sociale;
    private List<Impots> listImpost = new ArrayList<>();
    public Societe(long id, String raison_sociale) {
        this.id = id;
        this.raison_sociale = raison_sociale;
    }
    public Impots getImpots(int anne){
        for (Impots imp: listImpost) {
            if (imp.getAnne() == anne) return imp;
        }
        return null;
      }
    public void add(Impots imp) {
        listImpost.add(imp);
    }

    @Override
    public String toString() {
        return "Societe: " + id + "- " + raison_sociale;
    }
}
