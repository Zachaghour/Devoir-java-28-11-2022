package com.devoir;

public class DossierRevenus extends Dossier{

    private double ca;

    public DossierRevenus(long id, double ca) {
        super(id);
        this.ca = ca;
        this.calclumerMontant();
    }

    @Override
     protected void calclumerMontant() {
        super.montant = ca * 0.15;
    }

    @Override
    public String toString() {
        return "15% de revennus "+ ca +", Montant: "+ super.montant;
    }
}
