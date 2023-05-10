package models;

import casa.*;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;

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
        Curte curte = new Curte(m9, 10);

        m1.translateX(1);
        m2.translateX(1);
        m3.translateX(1);
        m4.translateX(1);
        m5.translateX(1);
        m6.translateX(1);
        m7.translateX(1);
        m8.translateX(1);
        m9.translateX(1);

        ArrayList<Constructie> constructies = new ArrayList<>();

        constructies.add(casa);
        constructies.add(pancarta);
        constructies.add(curte);

        assertEquals(2,m1.getX());
        assertEquals(4,m2.getX());
        assertEquals(6,m3.getX());
        assertEquals(8,m4.getX());
        assertEquals(10,m5.getX());
        assertEquals(12,m6.getX());
        assertEquals(14,m7.getX());
        assertEquals(16,m8.getX());
        assertEquals(18,m9.getX());
    }

    @Test
    void translateY() {
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
        Curte curte = new Curte(m9, 10);

        m1.translateY(1);
        m2.translateY(1);
        m3.translateY(1);
        m4.translateY(1);
        m5.translateY(1);
        m6.translateY(1);
        m7.translateY(1);
        m8.translateY(1);
        m9.translateY(1);

        ArrayList<Constructie> constructies = new ArrayList<>();

        constructies.add(casa);
        constructies.add(pancarta);
        constructies.add(curte);

        assertEquals(3,m1.getY());
        assertEquals(5,m2.getY());
        assertEquals(7,m3.getY());
        assertEquals(9,m4.getY());
        assertEquals(11,m5.getY());
        assertEquals(13,m6.getY());
        assertEquals(15,m7.getY());
        assertEquals(17,m8.getY());
        assertEquals(19,m9.getY());
    }

    @Test
    void translate() {
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
        Curte curte = new Curte(m9, 10);

        m1.translate(1,1);
        m2.translate(1,1);
        m3.translate(1,1);
        m4.translate(1,1);
        m5.translate(1,1);
        m6.translate(1,1);
        m7.translate(1,1);
        m8.translate(1,1);
        m9.translate(1,1);

        ArrayList<Constructie> constructies = new ArrayList<>();

        constructies.add(casa);
        constructies.add(pancarta);
        constructies.add(curte);

        assertEquals(2,m1.getX());
        assertEquals(4,m2.getX());
        assertEquals(6,m3.getX());
        assertEquals(8,m4.getX());
        assertEquals(10,m5.getX());
        assertEquals(12,m6.getX());
        assertEquals(14,m7.getX());
        assertEquals(16,m8.getX());
        assertEquals(18,m9.getX());

        assertEquals(3,m1.getY());
        assertEquals(5,m2.getY());
        assertEquals(7,m3.getY());
        assertEquals(9,m4.getY());
        assertEquals(11,m5.getY());
        assertEquals(13,m6.getY());
        assertEquals(15,m7.getY());
        assertEquals(17,m8.getY());
        assertEquals(19,m9.getY());
    }

    @Test
    void duplicate() {
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
        Curte curte = new Curte(m9, 10);

        m1.translate(1,1);
        m2.translate(1,1);
        m3.translate(1,1);
        m4.translate(1,1);
        m5.translate(1,1);
        m6.translate(1,1);
        m7.translate(1,1);
        m8.translate(1,1);
        m9.translate(1,1);

        ArrayList<Constructie> constructies = new ArrayList<>();

        constructies.add(casa);
        constructies.add(pancarta);
        constructies.add(curte);

        ArrayList<Constructie> duplicate = new ArrayList<>();
        for (int i=0; i<constructies.size(); i++){
            duplicate.add(constructies.get(i));
        }

        assertEquals(constructies,duplicate);
    }
}