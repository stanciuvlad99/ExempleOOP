package models;

import casa.Camere;
import casa.Metri;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamereTest {

    @Test
    void translateX() {
        Metri m1 = new Metri(1,3);
        Metri m2 = new Metri(2,5);

        Camere camere = new Camere(m1,m2);
        camere.translateX(2);

        assertEquals(3,camere.getM1().getX());
        assertEquals(4,camere.getM2().getX());
    }

    @Test
    void translateY() {
        Metri m1 = new Metri(2,5);
        Metri m2= new Metri(3,7);

        Camere camere = new Camere(m1,m2);
        camere.translateY(3);

        assertEquals(8,camere.getM1().getY());
        assertEquals(10,camere.getM2().getY());
    }

    @Test
    void translate() {
        Metri m1 = new Metri(4,7);
        Metri m2 = new Metri(2,6);

        Camere camere = new Camere(m1,m2);
        camere.translate(4,5);

        assertEquals(8,camere.getM1().getX());
        assertEquals(12,camere.getM1().getY());
        assertEquals(6,camere.getM2().getX());
        assertEquals(11,camere.getM2().getY());

    }

    @Test
    void duplicate() {
        Metri m1= new Metri(2,5);
        Metri m2= new Metri(3,6);
        Metri m3 = new Metri(5,12);
        Metri m4 = new Metri(6,13);

        Camere camere = new Camere(m1,m2);
        Camere camere1 = new Camere(m3,m4);
        camere.translate(3,7);

        assertEquals(camere1,camere.duplicate());

    }
}