package com.devoir;

public class DossierVehicule extends Dossier{
    private int nbChevaux;
    private char categorie;

    public DossierVehicule(long id, int nbChevaux, char cat) {
        super(id);
        this.categorie = cat;
        this.nbChevaux = nbChevaux;
        this.calclumerMontant();
    }

    @Override
    protected void calclumerMontant() {
        if(nbChevaux < 8) {
            if (categorie == 'E') {
                super.montant = 350;
            }else{
                super.montant = 700;
            }
        } else if(nbChevaux <= 10) {
            if (categorie == 'E') {
                super.montant = 650;
            }else{
                super.montant = 1500;
            }
        } else if (nbChevaux <= 14) {
            if (categorie == 'E') {
                super.montant = 3000;
            }else{
                super.montant = 6000;
            }
        }else {
            if (categorie == 'E') {
                super.montant = 8000;
            }else{
                super.montant = 20000;
            }
        }
    }

    @Override
    public String toString() {
        return "Vehicule "  + categorie +
                "" + nbChevaux +
                "CH , montant: "+ super.montant;
    }
}
