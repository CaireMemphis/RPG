import Classes.Monstres;
import Classes.Personnage;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Monde {

    static int nbPerso=0;
    public static Personnage personnageFactory(){
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.println("Nom du nouveau perso :");
        name = scan.next();
        System.out.println("------------------------------------------");
        nbPerso++;
        Personnage perso = new Personnage(300,50, name);

        return perso;
    }
public static void afficherInformations(){
    System.out.println("Personnages :" + nbPerso);

}
public static Monstres monstreFactory(){
    Monstres mob = new Monstres(150,20,genererNom());

       return mob;
    }
public static String genererNom(){

        //FUS-RHO-DAH !!!

        Random random = new Random();
        String nom = "";
    ArrayList<String>debutNom = new ArrayList<>();
    debutNom.add("Draugr nu ");
    debutNom.add("Dragonnet ");
    debutNom.add("Vasard ");
    debutNom.add("Petit Atronach ");
    debutNom.add("Squelette ");

    nom+= debutNom.get(random.nextInt(debutNom.size()));

       ArrayList<String>finNom = new ArrayList<>();
       finNom.add("de feu");
    finNom.add("de foudre");
    finNom.add("de glace");
    finNom.add("Ancien");
    finNom.add("de sang");
nom+=finNom.get(random.nextInt(finNom.size()));

return nom;
}
public static void combat(Personnage perso, Monstres mob){

        do {

            System.out.println(mob.toString() +"\n"+ perso.toString());
            System.out.println();
            System.out.println("----------------------------------");
            mob.setPv(mob.getPv()-perso.getAtk());

            System.out.println(perso.getNom() + " : " + perso.getAtk() + "damage !");
            System.out.println("----------------------------------");
            System.out.println(mob.toString() +"\n"+ perso.toString());
            System.out.println();
            System.out.println("----------------------------------");
            perso.setPv(perso.getPv() - mob.getAtk());

            System.out.println(mob.getNom()+" : " + mob.getAtk() + "damage !");
            System.out.println("----------------------------------");

        }while(perso.getPv()>0&&mob.getPv()>0);
        if (perso.getPv()> mob.getPv()){
            System.out.println(perso.toString());
            System.out.println(perso.getNom()+" Gagne !");
        }else {
            System.out.println(mob.toString());
            System.out.println(mob.getNom() + "gagne   :   Game Over !");
        }


}







}