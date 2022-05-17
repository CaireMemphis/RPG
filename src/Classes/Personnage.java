package Classes;

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

}
