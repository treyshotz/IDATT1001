package com.madslun;

import java.util.Random;

public class Spiller { //Klassen

    private Random terning = new Random(); //Objekter
    private String navn;    //Objekter
    private int sumPoeng;   //Objekter


    public Spiller(String navn) { //Konstruktør
        this.navn = navn;
    }


    public int kastTerning() { //Metode for å kaste terning
        int terningkast = terning.nextInt(6 ) +1;
        return terningkast;
    }


}
