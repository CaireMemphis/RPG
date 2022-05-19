package Classes;

public class Objet {
    private String nom;
    private String description;
    private int apport;

    public Objet(String nom, String description, int apport) {
        this.nom = nom;
        this.description = description;
        this.apport = apport;

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

    public int getApport() {
        return apport;
    }

    public void setApport(int apport) {
        this.apport = apport;
    }

    @Override
    public String toString() {
        return "Objet{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", apport=" + apport +
                '}';
    }
}
