package Classes;

public class Objet implements IObjet {
    private String nom;
    private String description;
    private int apportAtk;
    private int apportPv;

    public Objet(String nom, String description, int apportAtk, int apportPv) {
        this.nom = nom;
        this.description = description;
        this.apportAtk = apportAtk;
        this.apportPv = apportPv;

    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getApportAtk() {
        return apportAtk;
    }

    @Override
    public void setApportAtk(int apportAtk) {
        this.apportAtk = apportAtk;
    }

    @Override
    public int getApportPv() {
        return apportPv;
    }

    @Override
    public void setApportPv(int apportPv) {
        this.apportPv = apportPv;
    }


    public String toStringAll() {
return "-"+nom+"-";
    }


    public String toString(){
        return "Objet{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", apportAtk=" + apportAtk +
                ", apportPv=" + apportPv +
                '}';
    }
}
