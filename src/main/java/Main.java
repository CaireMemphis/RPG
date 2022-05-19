import Classes.Monstres;
import Classes.Personnage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // test avec LEEROY-JENKINS
Personnage perso = Monde.personnageFactory();
Monde.choixObjet(perso);
Monde.combat(perso,Monde.monstreFactory());
    }

}
