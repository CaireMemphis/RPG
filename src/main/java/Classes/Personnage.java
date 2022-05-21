package Classes;

import Interfaces.Combattant;

import java.util.ArrayList;
import java.util.Objects;

public class Personnage extends AbstractCombattant {
ArrayList<Objet> objets = new ArrayList<>();

    public Personnage(int pv, int atk, String nom) {
        super(pv, atk, nom);

    }

    @Override
    public String toString() {
        return "Personnage :" +
                " nom = '" + getNom() + '\'' +

                ",PV = " + getPv() + ", atk = " + getAtk() + ", objets = " + voirObjet();
    }

    public void prendreObjet(Objet objet){
        objets.add(objet);
        setAtk(getAtk()+objet.getApportAtk());
        setPv(getPv()+ objet.getApportPv());

    }
    public void lacherObjet(Objet objet){
        setAtk(getAtk() - objet.getApportAtk());
        setPv(getPv() - objet.getApportPv());
        objets.remove(objet);
    }
    public String voirObjet(){
        return objets.toString();
    }


}
