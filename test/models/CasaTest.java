package models;

import casa.Camere;
import casa.Metri;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasaTest {

    @Test
    void translateX() {
        Metri m1 = new Metri(3, 4);
        Metri m2 = new Metri(2, 5);
        Metri m3 = new Metri(5, 4);
        Metri m4 = new Metri(2, 5);

        Camere camere = new Camere(m1, m2);
        Camere camere1 = new Camere(m3, m4);

        camere.translateX(3);
        camere1.translateX(6);

        assertEquals(6,camere.getM1().getX());
        assertEquals(5,camere.getM2().getX());
        assertEquals(11,camere1.getM1().getX());
        assertEquals(8,camere1.getM2().getX());
    }

    @Test
    void translateY() {
        Metri m1 = new Metri(4,7);
        Metri m2 = new Metri(1,5);
        Metri m3 = new Metri(4,7);
        Metri m4 = new Metri(1,5);

        Camere camere1 = new Camere(m1,m2);
        Camere camere2 = new Camere(m3,m4);

        camere1.translateY(4);
        camere2.translateY(4);

        assertEquals(camere1,camere2);
    }

    @Test
    void translate() {
        Metri m1 = new Metri(4,7);
        Metri m2 = new Metri(1,5);
        Metri m3 = new Metri(4,7);
        Metri m4 = new Metri(1,5);

        Camere camere1 = new Camere(m1,m2);
        Camere camere2 = new Camere(m3,m4);

        camere1.translate(4,3);
        camere2.translate(4,3);

        assertEquals(camere1,camere2);
    }

    @Test
    void duplicate() {
        Metri m1 = new Metri(4,7);
        Metri m2 = new Metri(1,5);
        Metri m3 = new Metri(6,8);
        Metri m4 = new Metri(3,6);

        Camere camere1 = new Camere(m1,m2);
        Camere camere2 = new Camere(m3,m4);

        camere1.translate(2,1);

        assertEquals(camere2,camere1.duplicate());
    }
}