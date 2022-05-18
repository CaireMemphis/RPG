import Classes.Monstres;
import Classes.Personnage;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Monde {

    static int nbPerso=0;
     static int set1=0;
    static int set2=0;
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
String name = genererNom();

    ArrayList<Integer>healthPoints = new ArrayList<>();
    healthPoints.add(0,35);
    healthPoints.add(1,250);
    healthPoints.add(2,20);
    healthPoints.add(3,50);
    healthPoints.add(4,25);
    ArrayList<Integer>hitpoints = new ArrayList<>();
        hitpoints.add(0,10);
    hitpoints.add(1,50);
    hitpoints.add(2,5);
    hitpoints.add(3,15);
    hitpoints.add(4,10);

        int pv = (healthPoints.get(set1)) + (healthPoints.get(set2));
        int atk = (hitpoints.get(set1)) + (hitpoints.get(set2));


    Monstres mob = new Monstres(pv,atk,name);

       return mob;
    }
public static String genererNom(){

        //FUS-RHO-DAH !!!

        Random random = new Random();
        String nom = "";
    ArrayList<String>debutNom = new ArrayList<>();

    debutNom.add(0,"Draugr ");
    debutNom.add(1,"Dragon ");
    debutNom.add(2,"Vasard ");
    debutNom.add(3,"Atronach ");
    debutNom.add(4,"Squelette ");
    set1 =random.nextInt(debutNom.size());

    nom+= debutNom.get(set1);

       ArrayList<String>finNom = new ArrayList<>();
        finNom.add(0,"de feu");
        finNom.add(1,"Ancien");
        finNom.add(2,"de sang");
        finNom.add(3,"de foudre");
        finNom.add(4,"de glace");
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