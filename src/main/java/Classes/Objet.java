package Classes;

public class Objet {
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getApportAtk() {
        return apportAtk;
    }

    public void setApportAtk(int apportAtk) {
        this.apportAtk = apportAtk;
    }

    public int getApportPv() {
        return apportPv;
    }

    public void setApportPv(int apportPv) {
        this.apportPv = apportPv;
    }

    @Override
    public String toString() {
        return "Objet{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", apportAtk=" + apportAtk +
                ", apportPv=" + apportPv +
                '}';
    }
}
