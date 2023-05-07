package models;

import casa.Metri;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetriTest {

    @Test
    void translateX() {
        Metri m = new Metri(1,3);
        int expected = m.getX()+30;
        m.translateX(30);

        assertEquals(expected, m.getX());
    }

    @Test
    void translateY() {
        Metri m = new Metri(2,5);
        int expected= m.getY()+20;
        m.translateY(20);

        assertEquals(expected,m.getY());
    }

    @Test
    void translate() {
        Metri m = new Metri(5,6);
        int expectedX=m.getX()+2;
        int expectedY=m.getY()+7;
        m.translate(2,7);

        assertEquals(expectedX,m.getX());
        assertEquals(expectedY,m.getY());
    }

    @Test
    void duplicate() {
        Metri m = new Metri(1,5);
        Metri m1= new Metri(m.getX()+5,m.getY()+5);
        m.translate(5,5);

        assertEquals(m.duplicate(),m1);

    }
}