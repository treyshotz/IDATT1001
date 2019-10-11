/* Øving4del1, laget av Mads Lundegaard*/

//package com.madslun;

import java.util.Scanner;

public class Main {

    private static Valuta EUR = new Valuta(9.99198833, "EURO"); //Lager et nytt tilfelle av valuta og gir den en kurs og navn
    private static Valuta SEK = new Valuta(0.93014547, "SEK"); //Lager et nytt tilfelle av valuta og gir den en kurs og navn
    private static Valuta USD =  new Valuta(9.00187239, "USD"); //Lager et nytt tilfelle av valuta og gir den en kurs og navn


    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) { //Main metode

        while (true) { //Loop som gjør at man kan kjøre flere ganger
            Meny(); //Skriver ut meny
            int Valg = in.nextInt(); //Lagrer valg fra meny

            Valuta ValgtValuta = null;
            switch (Valg) { //Lagrer valg fra meny og setter den til valuta som ble laget lengre oppe
                case 1:
                    ValgtValuta = EUR;
                    break;
                case 2:
                    ValgtValuta = SEK;
                    break;
                case 3:
                    ValgtValuta = USD;
                    break;
                case 4:
                    System.out.println("Avslutter...");
                    System.exit(0); //Avslutter programmet
                default:
                    System.out.println("Du skrev inn noe feil, prøv på nytt"); //Skriver ut til skjerm
                    continue; //Starter på nytt

            }

            Antall(); //Skriver ut antall
            int AntallValgt = in.nextInt(); //Lagrer antall

            VeksleMetode(); //Skriver ut valg av veksling
            int Metode = in.nextInt(); //Lagrer metode

            //Printer ut valuta ganget/delt på antall nok
            if (Metode == 1) {
                System.out.println(ValgtValuta.NokTilValuta(AntallValgt)); //Skriver ut til skjerm med ValutaValg med metode 1 hentet fra Valuta klassen og ganger med antallValgt
            }
            else if (Metode == 2) {
                System.out.println(ValgtValuta.ValutaTilNok(AntallValgt)); //Skriver ut til skjerm med ValutaValg med metode 2 hentet fra Valuta klassen og ganger med antallValgt

            }
            else {System.out.println("Du skrev inn noe feil.");} //Skriver ut til skjerm

            PåNytt(); //Skriver ut meny
            int pånytt = in.nextInt();
            if (pånytt == 2) {
                System.out.println("Programmet er nå avsluttet");
                System.exit(0); //Avslutter programmet
            }
        }
    } // Main metode slutt


        private static void Antall() {
            System.out.println("Hvor mye vil du regne ut?"); //Skriver ut til skjerm
        }

        private static void Meny() {
            System.out.print("Du kan nå velge valuta\n" +
                    "1. Euro\n" +
                    "2. Sek\n" +
                    "3. USD\n" +
                    "4. Avslutt\n");
        } //

        private static void VeksleMetode() {
            System.out.println("Vil du veksle: \n" + //Skriver ut til skjerm
                                "1. Fra NOK\n" +
                                "2. Til NOK");
        }

        private static void PåNytt() {
            System.out.println("Vil du prøve på nytt? \n" + //Skriver ut til skjerm
                                "1. Ja \n" +
                                "2. Nei");
        }

} //Klasse main slutt

