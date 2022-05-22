package Classes;

import Interfaces.Combattant;

import java.util.ArrayList;
import java.util.Objects;

public class Personnage extends AbstractCombattant {
ArrayList<Objet> objets = new ArrayList<>();
static int pvTotal;
    public Personnage(int pv, int atk, String nom) {
        super(pv, atk, nom);
pvTotal = pv;
    }

    public ArrayList<Objet> getObjets() {
        return objets;
    }

    public static int getPvTotal() {
        return pvTotal;
    }

    @Override
    public String toString() {
        return "Personnage :" +
                " nom = '" + getNom() + '\'' +

                ",PV = " + getPv() + ", atk = " + getAtk() + ", objets = " + VoirObjetAll();
    }

    public void prendreObjet(Objet objet){
        objets.add(objet);
        setAtk(getAtk()+objet.getApportAtk());
        setPv(getPv()+ objet.getApportPv());
        pvTotal += objet.getApportPv();

    }
    public void lacherObjet(Objet objet){
        setAtk(getAtk() - objet.getApportAtk());
        setPv(getPv() - objet.getApportPv());
        pvTotal -= objet.getApportPv();
        objets.remove(objet);
    }
    public String voirObjet(){
       return objets.toString();
    }
public String VoirObjetAll(){
        String affich = "";
    for (int i = 0; i < objets.size(); i++) {
        affich += objets.get(i).toStringAll();
    }
        return affich;
}

}
