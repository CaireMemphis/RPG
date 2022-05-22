package Classes;

public interface IObjet {
    String getNom();

    void setNom(String nom);

    String getDescription();

    void setDescription(String description);

    int getApportAtk();

    void setApportAtk(int apportAtk);

    int getApportPv();

    void setApportPv(int apportPv);

    static String toStringAll() {
        return null;
    }

    @Override
    String toString();
}
