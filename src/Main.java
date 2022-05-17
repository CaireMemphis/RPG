import Classes.Personnage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // test avec LEROY-JENKINS
        personnageFactory();


    }
    public static void personnageFactory(){
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.println("Nom du nouveau perso :");
        name = scan.next();
        System.out.println("------------------------------------------");
        System.out.println(new Personnage(name));
    }
}
