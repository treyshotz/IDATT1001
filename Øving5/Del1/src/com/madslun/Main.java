package com.madslun;

import java.awt.*;

public class Main {

    private static Brøk b1 = new Brøk(1, 2); //Gir variabler vha metoden
    private static Brøk b2 = new Brøk(3, 4); //Gir variable vha metoden

    public static void main(String[] args) {
        System.out.println("Brøk 1: " + b1.getTeller() + "/" + b1.getNevner());
        System.out.println("Brøk 2: " + b2.getTeller() + "/" + b2.getNevner());


        int a = b2.getTeller();
        int b = b2.getNevner();

        System.out.println("\nGanging: ");
        b1.ganging(b2.getTeller(),b2.getNevner());
        System.out.println("= " + b1.getTeller() + "/" + b1.getNevner());

        System.out.println("\nDeling: ");
        System.out.println("Brøk 1: " + b1.getTeller() + "/" + b1.getNevner());
        System.out.println("Brøk 2: " + b2.getTeller() + "/" + b2.getNevner() + "\n");
        b1.deling(b2.getTeller(),b2.getNevner());
        System.out.println( "= " + b1.getTeller() + "/" + b1.getNevner());

        System.out.println("\n Addisjon: ");
        System.out.println("Brøk 1: " + b1.getTeller() + "/" + b1.getNevner());
        System.out.println("Brøk 2: " + b2.getTeller() + "/" + b2.getNevner());
        b1.addisjon(b2.getTeller(), b2.getNevner());
        System.out.println("= " + b1.getTeller() + "/" + b1.getNevner());

        System.out.println("\n Subtrakjson: ");
        System.out.println("Brøk 1: " + b1.getTeller() + "/" + b1.getNevner());
        System.out.println("Brøk 2: " + b2.getTeller() + "/" + b2.getNevner());
        b1.subtraksjon(b2.getTeller(), b2.getNevner());
        System.out.println("= " + b1.getTeller() + "/" + b1.getNevner());
        /*b1.gcm(b1.getTeller(), b1.getNevner());
        System.out.println("= " + b1.getTeller() + "/" + b1.getNevner()); */


    }
}
