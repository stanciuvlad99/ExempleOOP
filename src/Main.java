import casa.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Metri m1 = new Metri(1,2);
        Metri m2 = new Metri( 3,4);
        Metri m3 = new Metri(5,6);
        Metri m4 = new Metri(7,8);
        Metri m5 = new Metri(9,10);
        Metri m6 = new Metri(11,12);
        Metri m7 = new Metri(13,14);
        Metri m8 = new Metri(15,16);
        Metri m9 = new Metri(17,18);

        Dimensini c1 = new Dimensini(m1,m2);
        Dimensini c2 = new Dimensini(m3,m4);
        Dimensini c3 = new Dimensini(m5,m6);
        Dimensini c4 = new Dimensini(m7,m8);

        String text= "Sunt o pancarta";

        Casa casa = new Casa(c1,c2);
        Pancarta pancarta = new Pancarta(c3,c4, text);
        Curte curte = new Curte(m9,4);

        ArrayList<Constructie> constructies = new ArrayList<>();
        constructies.add(casa);
        constructies.add(pancarta);
        constructies.add(curte);


        Schita schita = new Schita(constructies);
        schita.afisare();
    }
}