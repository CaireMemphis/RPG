import Classes.Monstres;
import Classes.Personnage;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Monde {

    static int nbPerso=0;
     static int set1=0;
    static int set2=0;
    static Random random = new Random();
    public static Personnage personnageFactory(){
        Scanner scan = new Scanner(System.in);
        String name = "LEEROY JENKINS";
        //System.out.println("Nom du nouveau perso :");
        //name = scan.next();
        System.out.println("------------------------------------------");
        nbPerso++;
        Personnage perso = new Personnage(1000, 200, name);
        System.out.println("Nouveau perso : " + perso.getNom() + " !");
        return perso;
    }
public static void afficherInformations(){
    System.out.println("Personnages :" + nbPerso);

}
public static Monstres monstreFactory(){
String name = genererNom();

    ArrayList<Integer>healthPoints = new ArrayList<>();

    healthPoints.add(350);
    healthPoints.add(4500);
    healthPoints.add(200);
    healthPoints.add(500);
    healthPoints.add(250);
    healthPoints.add(-100);
    healthPoints.add(350);
    healthPoints.add(750);
    healthPoints.add(1000);
    healthPoints.add(50);

    ArrayList<Integer>hitpoints = new ArrayList<>();

    hitpoints.add(50);
    hitpoints.add(500);
    hitpoints.add(20);
    hitpoints.add(75);
    hitpoints.add(50);
    hitpoints.add(200);
    hitpoints.add(100);
    hitpoints.add(200);
    hitpoints.add(350);
    hitpoints.add(10);

        int pv = (healthPoints.get(set1)) + (healthPoints.get(set2));
        int atk = (hitpoints.get(set1)) + (hitpoints.get(set2));


    Monstres mob = new Monstres(pv,atk,name);

       return mob;
    }
public static String genererNom(){

        //FUS-RHO-DAH !!!


        String nom = "";
    ArrayList<String>debutNom = new ArrayList<>();

    debutNom.add("Draugr ");
    debutNom.add("Dragon ");
    debutNom.add("Vasard ");
    debutNom.add("Atronach ");
    debutNom.add("Squelette ");
    debutNom.add("Chaurus ");
    debutNom.add("Loup ");
    debutNom.add("Golem ");
    debutNom.add("Geant ");
    debutNom.add("Ragnard ");

    set1 =random.nextInt(debutNom.size());

    nom+= debutNom.get(set1);

       ArrayList<String>finNom = new ArrayList<>();
        finNom.add("de feu");
        finNom.add("Ancien");
        finNom.add("de sang");
        finNom.add("de foudre");
        finNom.add("de glace");
        finNom.add("infecté");
        finNom.add("alpha");
        finNom.add("Antique");
        finNom.add("des profondeurs");
        finNom.add("");

        set2 = random.nextInt(finNom.size());


nom+=finNom.get(set2);

return nom;
}
public static void combat(Personnage perso, Monstres mob){

        do {

            System.out.println(mob.toString() +"\n"+ perso.toString());
            System.out.println();
            System.out.println("----------------------------------");
            mob.setPv(mob.getPv()-perso.getAtk());

            System.out.println(perso.getNom() + " : " + perso.getAtk() + "damage !");
            if(mob.getPv()<=0){break;}
            System.out.println("----------------------------------");
            System.out.println(mob.toString() +"\n"+ perso.toString());
            System.out.println();
            System.out.println("----------------------------------");
            perso.setPv(perso.getPv() - mob.getAtk());

            System.out.println(mob.getNom()+" : " + mob.getAtk() + "damage !");
            if(perso.getPv()<=0){break;}
            System.out.println("----------------------------------");

        }while(perso.getPv()>0&&mob.getPv()>0);
        if (perso.getPv()> mob.getPv()){
            System.out.println(perso.toString());
            System.out.println("Victoire !");
        }else {
            System.out.println(mob.toString());
            System.out.println("Game Over !");
        }


}







}