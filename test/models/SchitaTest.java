package casa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchitaTest {

    @Test
    void translateX() {
        Metri m1 = new Metri(1,2);
        Metri m2 = new Metri(3,4);
        Metri m3 = new Metri(5,6);
        Metri m4 = new Metri(7,8);
        Metri m5 = new Metri(9,10);
        Metri m6 = new Metri(11,12);
        Metri m7 = new Metri(13,14);
        Metri m8 = new Metri(15,16);
        Metri m9 = new Metri(17,18);

        Dimensini d1 = new Dimensini(m1,m2);
        Dimensini d2 = new Dimensini(m3,m4);
        Dimensini d3 = new Dimensini(m5,m6);
        Dimensini d4 = new Dimensini(m7,m8);

        String text= "sunt o pancarta";

        Casa casa = new Casa(d1,d2);
        Pancarta pancarta = new Pancarta(d3,d4,text);
        

    }

    @Test
    void translateY() {
    }

    @Test
    void translate() {
    }

    @Test
    void duplicate() {
    }
}