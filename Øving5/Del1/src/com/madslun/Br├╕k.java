package com.madslun;


/*TODO:
    1. Lag en metode for ganging av brøk
    2. Lag en getTeller() og getNever() metoder
    3. Lag to brøker og test ut om det funker (Resultatet skal ikke returneres i metodene men ligger i "this")
    4. Legg til divisjon
    5. Lag en metode som finner fellesnevner
    6. Lag en en metode for addisjon og subtraksjon
 */

public class Brøk { //Klasse
    private int teller;
    private int nevner;

    public Brøk(int teller, int nevner) { //Konstruktør
        this.teller = teller;
        this.nevner = nevner;
    }

    public void ganging(int teller, int nevner) { //Metode for ganging
        this.teller = teller * this.teller;
        this.nevner = nevner * this.nevner;
    }

    public void deling(int teller, int nevner) { //Metode for deling
        this.teller = nevner * this.teller;
        this.nevner = teller * this.nevner;
    }

    /*public int gcm(int a, int b) { //Metode for fellesnevner
        return this.nevner == 0 ? this.teller : gcm(this.nevner, this.teller % this.nevner);
       /*public int gcm (int teller, int nevner)
        {
            while (teller != nevner)
            {
                if (teller > nevner)
                    teller = teller - nevner;
                else
                    nevner = nevner - teller;
            }
            return teller;
        }*/

    //}

    public void addisjon(int teller, int nevner) { //Metode for addisjon
        this.teller = this.teller * nevner + teller * this.nevner;
        this.nevner = this.nevner * nevner;

    }
    public void subtraksjon(int teller, int nevner) {
        this.teller = this.teller * nevner - teller * this.nevner;
        this.nevner = this.nevner * nevner;
        /*int x=gcm(this.teller, this.nevner);
        this.teller = this.teller/x;
        this.nevner = this.nevner/x;*/
    }


    public int getTeller() { //Metode som returnerer teller
        return teller;
    }
    public int getNevner() { //Metode som returnerer nevner
        return nevner;
    }


}
