package Classes;

import Interfaces.Combattant;

import java.util.Objects;

public class Personnage extends AbstractCombattant {


    public Personnage(int pv, int atk, String nom) {
        super(pv, atk, nom);

    }

    @Override
    public String toString() {
        return "Personnage :" +
                " nom = '" + getNom() + '\'' +

                ",PV = " + getPv() + ", atk = " + getAtk();
    }

    @Override
    public void attaquer(Combattant adversaire) {

    }

    @Override
    public void defendre(int degats) {

    }
}
