//package com.madslun;

public class Valuta {   //Klasse


    private double kurs; //Lager objekt
    private String valuta; //Lager objekt

    public Valuta(double kurs, String valuta) { //Lager konstruktør
        this.kurs = kurs;
        this.valuta = valuta;
    }

    public double ValutaTilNok(double AntallValgt) { //Metode for å regne til NOK
        return kurs * AntallValgt;
    }

    public double NokTilValuta(double AntallValgt) { //Metode for å regne fra NOK
        return kurs / AntallValgt;

    }

}



