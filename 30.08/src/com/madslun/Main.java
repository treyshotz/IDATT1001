package com.madslun;

import java.awt.*;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int teller = 0;
        int linjeTeller = 0;
        String stjerne = "*";

        System.out.println("Skriv inn et tall");
        int antall = in.nextInt();

        while (antall>=teller) {
            teller++;
            while (linjeTeller<=teller) {
                linjeTeller = 0;
                System.out.println(stjerne + " h");
                linjeTeller++;
            }
            System.out.println("");

        }



    }
}
