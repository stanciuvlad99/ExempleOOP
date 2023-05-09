package models;

import casa.Dimensini;
import casa.Metri;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DimensiniTest {

    @Test
    void translateX() {
        Metri m1 = new Metri(1,3);
        Metri m2 = new Metri(2,5);

        Dimensini dimensini = new Dimensini(m1,m2);
        dimensini.translateX(2);

        assertEquals(3, dimensini.getM1().getX());
        assertEquals(4, dimensini.getM2().getX());
    }

    @Test
    void translateY() {
        Metri m1 = new Metri(2,5);
        Metri m2= new Metri(3,7);

        Dimensini dimensini = new Dimensini(m1,m2);
        dimensini.translateY(3);

        assertEquals(8, dimensini.getM1().getY());
        assertEquals(10, dimensini.getM2().getY());
    }

    @Test
    void translate() {
        Metri m1 = new Metri(4,7);
        Metri m2 = new Metri(2,6);

        Dimensini dimensini = new Dimensini(m1,m2);
        dimensini.translate(4,5);

        assertEquals(8, dimensini.getM1().getX());
        assertEquals(12, dimensini.getM1().getY());
        assertEquals(6, dimensini.getM2().getX());
        assertEquals(11, dimensini.getM2().getY());

    }

    @Test
    void duplicate() {
        Metri m1= new Metri(2,5);
        Metri m2= new Metri(3,6);
        Metri m3 = new Metri(5,12);
        Metri m4 = new Metri(6,13);

        Dimensini dimensini = new Dimensini(m1,m2);
        Dimensini dimensini1 = new Dimensini(m3,m4);
        dimensini.translate(3,7);

        assertEquals(dimensini1, dimensini.duplicate());

    }
}