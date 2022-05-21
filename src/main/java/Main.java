import Classes.Personnage;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       // test avec LEEROY-JENKINS
//Personnage perso = Monde.personnageFactory();
        Personnage perso = new Personnage(1000, 200,"Fred");
//Monde.choixObjet(perso);
Monde.combat(perso,Monde.monstreFactory());
Monde.combat(perso,Monde.monstreFactory());
Monde.combat(perso,Monde.monstreFactory());
Monde.combat(perso,Monde.monstreFactory());



    }

}





