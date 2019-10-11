package com.madslun;

import java.util.Random;

public class MinRandom { //Klasse

    private static Random tilfeldigTall = new Random(); //Objekter
    private int nedre; //Objekter
    private int ovre; //Objekter

    public static int nesteHeltall(int nedre, int ovre) { // Metode
        return tilfeldigTall.nextInt(ovre - nedre) + nedre;

    }

    public static double nesteDesimaltall(double nedre, double ovre) { //Metode
        return tilfeldigTall.nextDouble()* (ovre-nedre) + nedre;

    }
}
