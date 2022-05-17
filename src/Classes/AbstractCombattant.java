package Classes;

import Interfaces.Combattant;

public abstract class AbstractCombattant implements Combattant {
    private int pv;
    private int atk;
    private String nom;

    public AbstractCombattant(int pv, int atk, String nom) {
        this.pv = pv;
        this.atk = atk;
        this.nom = nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
