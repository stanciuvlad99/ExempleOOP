package models;

import casa.Metri;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurteTest {

    @Test
    void translateX() {
        Metri metri = new Metri(1,2);
        metri.translateX(2);

        assertEquals(3,metri.getX());

    }

    @Test
    void translateY() {
        Metri metri = new Metri(1,3);
        metri.translateY(3);

        assertEquals(6,metri.getY());
    }

    @Test
    void translate() {
        Metri metri = new Metri(1,2);
        metri.translate(2,3);

        assertEquals(3,metri.getX());
        assertEquals(5,metri.getY());
    }

    @Test
    void duplicate() {
        Metri metri = new Metri(1,2);
        Metri expected = new Metri(2,4);
        metri.translate(1,2);

        assertEquals(expected, metri.duplicate());
    }
}