package com.madslun;

import java.util.Random;

public class Main {

   private static Spiller spillerA = new Spiller("A");
   private static Spiller spillerB = new Spiller("B");

    public static void main(String[] args) {

        spillerA.kastTerning();
        spillerB.kastTerning();


    }
}
