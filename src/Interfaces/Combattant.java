package Interfaces;

public interface Combattant {
    public void attaquer(Combattant adversaire);
    public void defendre(int degats);
    public String getNom();
    public void setNom(String nom);
    public int getPointDeVie();
    public void setPointDeVie(int pdv);
    public int getDegats();
    public void setDegats(int degats);
}
