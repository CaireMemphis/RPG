package Classes;

import Interfaces.Combattant;

import java.util.Random;

public abstract class AbstractCombattant implements Combattant {
    private int pv;
    private int atk;
    private String nom;
    private double txCritiq;

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

    public void attaquer(Combattant adversaire) {
        int degats = (int) (getAtk() * tauxCritiqueAttaque());
        System.out.println(getNom() + " attaque de " + degats + " points");
        adversaire.defendre(degats);
    }
    public void defendre(int degats) {
        int defense = (int) ( degats * (tauxCritiqueDefence()));
        setPv((int) (getPv() - (defense)));
        System.out.println(getNom() + " se prend "+ defense +" points de degats");
    }
public double tauxCritiqueAttaque(){
    //taux de critique (0-2% = +80% ----- 3-5% = +40% ------ 6-15% = +15% ------ 16 - 86% = 0 ------ 87-94 = -15% --------- 95-98% = -40% ---------- 99-100% = -80%

    Random random = new Random();
    int pourcenCritique = random.nextInt(100);
if (pourcenCritique<=2){
    txCritiq = 1.8;
    System.out.println("taux : +80%");
}
    if (pourcenCritique>=3 && pourcenCritique<6){
        txCritiq = 1.4;
        System.out.println("taux : +40%");
    }
    if (pourcenCritique>=6 && pourcenCritique<15){
        txCritiq = 1.15;
        System.out.println("taux : +15%");
    }
    if (pourcenCritique>=16 && pourcenCritique<87){
        txCritiq = 1;
        System.out.println("taux : nul");
    }
    if (pourcenCritique>=87 && pourcenCritique<95){
        txCritiq = 0.85;
        System.out.println("taux : -15%");
    }
    if (pourcenCritique>=95 && pourcenCritique<99){
        txCritiq = 0.6;
        System.out.println("taux : -40%");
    }
    if (pourcenCritique>=99 && pourcenCritique<=100){
        txCritiq = 0.2;
        System.out.println("taux : -80%");
    }

return txCritiq;
}
    public double tauxCritiqueDefence(){
        //taux de critique (0-2% = +80% ----- 3-5% = +40% ------ 6-15% = +15% ------ 16 - 86% = 0 ------ 87-94 = -15% --------- 95-98% = -40% ---------- 99-100% = -80%

        Random random = new Random();
        int pourcenCritique = random.nextInt(100);
        if (pourcenCritique<=2){
            txCritiq = 0.0;
            System.out.println("taux : +100%");
        }
        if (pourcenCritique>=3 && pourcenCritique<6){
            txCritiq = 0.7;
            System.out.println("taux : +70%");
        }
        if (pourcenCritique>=6 && pourcenCritique<15){
            txCritiq = 0.5;
            System.out.println("taux : +50%");
        }
        if (pourcenCritique>=16 && pourcenCritique<40){
            txCritiq = 0.85;
            System.out.println("taux : +15%");
        }
        if (pourcenCritique>=40 && pourcenCritique<=100){
            txCritiq = 1;
            System.out.println("taux : nul");
        }

        return txCritiq;
    }



}
