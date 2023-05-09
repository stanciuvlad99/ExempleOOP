package models;

import casa.Dimensini;
import casa.Metri;
import casa.Pancarta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PancartaTest {

    @Test
    void testToString() {
        Metri metri1 = new Metri(1,2);
        Metri metri2 = new Metri(3,4);
        Metri metri3 = new Metri(5,6);
        Metri metri4 = new Metri(7,8);

        Dimensini d1 = new Dimensini(metri1,metri2);
        Dimensini d2 = new Dimensini(metri3,metri4);

        String text= "Sunt o pancarta";

        Pancarta pancarta = new Pancarta(d1,d2,text);
        System.out.println(pancarta);

    }

    @Test
    void duplicate() {
        Metri metri1 = new Metri(1,2);
        Metri metri2 = new Metri(3,4);
        Metri metri3 = new Metri(5,6);
        Metri metri4 = new Metri(7,8);

        Dimensini d1 = new Dimensini(metri1,metri2);
        Dimensini d2 = new Dimensini(metri3,metri4);

        String text= "Sunt o pancarta";

        Pancarta pancarta = new Pancarta(d1,d2, text);
        pancarta.translateX(2);

        assertEquals(pancarta, pancarta.duplicate());
    }
}