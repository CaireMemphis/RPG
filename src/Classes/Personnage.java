package Classes;

import java.util.Objects;

public class Personnage {
    private int pv;
    private int atk;
    private String nom;

    public Personnage(String nom) {
        this.nom = nom;
        this.atk = 1;
        this.pv = 10;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;

    }

    @Override
    public String toString() {
        return "Personnage :" +
                " nom = '" + nom + '\'' +

                ",PV = "+ pv +", atk = " + atk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personnage that = (Personnage) o;
        return pv == that.pv && atk == that.atk && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pv, atk, nom);
    }
}
