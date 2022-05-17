package Classes;

import Interfaces.IPersonnage;

public class Monstres extends AbstractCombattant {


    public Monstres(int pv, int atk, String nom) {
        super(pv, atk, nom);
    }

    @Override
    public String toString() {
        return "Monstre :" +
                " nom = '" + getNom() + '\'' +
                ",PV = " + getPv() + ", atk = " + getAtk();
    }
}
