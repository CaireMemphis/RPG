package Classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractCombattantTest {
    Personnage perso;
    Monstres mob;

    @BeforeEach
    void setUp(){
        perso = new Personnage(300,30,"Leeroy");
        mob = new Monstres(300,30,"jenkins");
    }


    @Test
    void getNom() {
    }

    @Test
    void getPv() {
    }

    @Test
    void getAtk() {
    }

    @Test
    void attaquer() {

    }

    @Test
    void defendre() {
    }

}