import Classes.Monstres;
import Classes.Personnage;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int commande = 0;
       // test avec LEEROY-JENKINS
//Personnage perso = Monde.personnageFactory();
        Personnage perso = Monde.personnageFactory();
//Monde.choixObjet(perso);
        Monde.choixObjet(perso);

do{
    System.out.println("Que voulez vous faire ?");
    System.out.println("combattre ? : 1");
    System.out.println("vous soigner ? : 2");
    System.out.println("Quitter la partie ? : 0");
    Scanner scanner = new Scanner(System.in);
    commande = scanner.nextInt();
switch (commande){
    case (0): {

        System.out.println();
        System.out.println(" Au Revoir !");
        break;
    }
    case(1):{
        Monstres  mob = Monde.monstreFactory();
        System.out.println();
        System.out.println("Un "+ mob.getNom() + " Apparait !");
        System.out.println();
        Monde.combat(perso,mob);
        break;
    }
    case (2):{

        System.out.println();
        System.out.println("Vous vous reposer et recuperer "+ (perso.getPvTotal()- perso.getPv())+" PV sur " + perso.getPvTotal() +" !");
        System.out.println();
        Monde.repos(perso);
    }
}
    }while(commande != 0);
}
}





