package com.devoir;

import java.util.ArrayList;
import java.util.List;

public class Impots {
    private int anne;
    private double totalImpot;
    private List<Dossier> listDossies = new ArrayList<>();

    public Impots(int anne) {
        this.anne = anne;
    }

    public int getAnne() {
        return anne;
    }

    public void add(Dossier d) {
        this.totalImpot +=d.montant;
        listDossies.add(d);
    }

    @Override
    public String toString() {
        String show = "List des impots "+ anne;

        for (Dossier d:listDossies) {
            show += "\n "+d.toString();
        }
        show += " \n Total:"+totalImpot;
        return show;
    }
}
