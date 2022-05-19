import Classes.Monstres;
import Classes.Objet;
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
        System.out.println("Nom du nouveau perso :");
        String name = scan.next();
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
    healthPoints.add(1200);
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
    hitpoints.add(300);
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

            perso.attaquer(mob);

            if(mob.getPv()<=0){break;}

            System.out.println("----------------------------------");
            System.out.println(mob.toString() +"\n"+ perso.toString());
            System.out.println();
            System.out.println("----------------------------------");
            mob.attaquer(perso);
            if(perso.getPv()<=0){break;}
            System.out.println("----------------------------------");

        }while(perso.getPv()>0&&mob.getPv()>0);
    System.out.println();
    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
    System.out.println();
        if (perso.getPv()> mob.getPv()){
            System.out.println(perso.toString());
            System.out.println("Victoire !");
            Objet
            perso.prendreObjet();
        }else {
            System.out.println(mob.toString());
            System.out.println("Game Over !");
        }


}
public static void choixObjet(Personnage perso){
        Scanner scanner =new Scanner(System.in);
    System.out.println(" choisissez un objet :");

    Objet bagueDeVie = new Objet("Bague de vie","acroit la santé de 50 points",200);
       Objet grandeEpee = new Objet("Grande Epee","augmente la force de 60 points",100);
       Objet lance = new Objet("Lance", "augmente l'attaque de 45 points ",75);
    System.out.println("choix 1 : "+bagueDeVie.toString());
    System.out.println("choix 2 : "+grandeEpee.toString());
    System.out.println("choix 3 : "+lance.toString());

    int choix = scanner.nextInt();


        switch (choix){
            case (1):{
                perso.prendreObjet(bagueDeVie);
                perso.setPv(perso.getPv() + bagueDeVie.getApport());
                break;
            }
            case (2):{
                perso.prendreObjet(grandeEpee);
                perso.setAtk(perso.getAtk() + grandeEpee.getApport());
                break;
            }
            case (3):{
                perso.prendreObjet(lance);
                perso.setAtk(perso.getAtk() + lance.getApport());
                break;
            }
        }




}






}