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
Objet loot = loot();

            System.out.println("Loot : " + loot );
            perso.prendreObjet(loot);
            System.out.println(perso.toString());
            System.out.println("Victoire !");
            repos(perso);
        }else {
            System.out.println(mob.toString());
            System.out.println("Game Over !");
            System.exit(0);
        }


}
public static void choixObjet(Personnage perso){
        Scanner scanner =new Scanner(System.in);
    System.out.println(" choisissez un objet :");

    Objet bagueDeVie = new Objet("Bague de vie","acroit la santé de 200 points",0,200);
       Objet grandeEpee = new Objet("Grande Epee","augmente la force de 100 points",100,0);
       Objet lanceRouge = new Objet("Lance Rouge", "augmente l'attaque de 75 points et 80 points de santé",75,80);
    System.out.println("choix 1 : "+bagueDeVie.toString());
    System.out.println("choix 2 : "+grandeEpee.toString());
    System.out.println("choix 3 : "+lanceRouge.toString());

    int choix = scanner.nextInt();


        switch (choix){
            case (1):{
                perso.prendreObjet(bagueDeVie);
                break;
            }
            case (2):{
                perso.prendreObjet(grandeEpee);
                break;
            }
            case (3):{
                perso.prendreObjet(lanceRouge);
                break;
            }
        }




}
public static Objet loot(){
        ArrayList<Objet>loots = new ArrayList<>();



    Objet crocDeLune = new Objet("Croc de Lune","",140,150);
        Objet rasoir = new Objet("Rasoir du fou","rasoir enchanté à ajouter à son bracelet",160,-80);
        Objet cotteDeMaille = new Objet("Cotte de maille","Cotte de maille rouillé à l'entreJambes",0,200);
        Objet Dague = new Objet("Dague d'acier","",90,0);
        Objet BatonDuBerger = new Objet("baton du berger","baton de paix du celebre berger Xavier dupont de Ligonnes",-40,150);
        Objet Bouton = new Objet("Bouton","Un bouton de chemise quoi ...",0,0);
        Objet CoeurDuDragon = new Objet("Coeur du dragon","le coeur d'un dragon mort il y a un siecle",200,700);
        Objet clouRouille = new Objet("Clou Rouille","Vous l'avez pris dans le pied",0,-20);
        Objet Durandal = new Objet("Durandal","un epee sa mere...",550,0);
        Objet Cuir = new Objet("Cuir","",0,0);
        Objet Bottes = new Objet("Bottes","",0,50);
        Objet casque = new Objet("Casque","",0,50);
        Objet masse = new Objet("Masse","Une grosse masse, pour compenser...",250,0);
        Objet Mjolnir = new Objet("Mjolnir","Le marteau de Thor",1500,200);
        Objet ArmureDaedra = new Objet("Armure Daedra","Armure d'un seigneur dremora",500,1200);

    loots.add(crocDeLune);
    loots.add(rasoir);
    loots.add(cotteDeMaille);
    loots.add(Dague);
    loots.add(BatonDuBerger);
    loots.add(Bouton);
    loots.add(CoeurDuDragon);
    loots.add(clouRouille);
    loots.add(Durandal);
    loots.add(Cuir);
    loots.add(Cuir);
    loots.add(Cuir);
    loots.add(Bottes);
    loots.add(casque);
    loots.add(masse);
    loots.add(Mjolnir);
    loots.add(ArmureDaedra);
       int hasard = random.nextInt(loots.size());

   return loots.get(hasard);
}
public static void repos(Personnage perso){
        Scanner scan = new Scanner(System.in);
    System.out.println("Que voulez vous faire ? Se reposer puis continuer : 1 // Continuer directement : autre touche");
        int choix = scan.nextInt();
        if(choix == 1) {
            perso.setPv(perso.getPvTotal());
        }

        }




}



