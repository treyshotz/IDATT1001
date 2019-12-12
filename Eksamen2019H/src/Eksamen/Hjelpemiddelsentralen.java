package Eksamen;

import java.util.*;


public class Hjelpemiddelsentralen {


    private ArrayList<Hjelpemiddel> utstyr = new ArrayList<>();
    private String navn;


    /**
     * Konstruktør for å opprette et objekt av typen Hjelpemiddelsentral.
     *
     * @param utstyr, ArrayList
     * @param navn, String
     */
    public Hjelpemiddelsentralen(ArrayList<Hjelpemiddel> utstyr, String navn) {
        this.utstyr = utstyr;
        this.navn = navn;
    }


    /**
     * Registrere nytt hjelpemiddel
     *
     * @param type      the type
     * @param utleid    the utleid
     * @param leietaker the leietaker
     * @return the boolean
     */
    public boolean regHjelpemiddel(String type, boolean utleid, String leietaker) {
        //Sjekker om type er blank og hvis den er utleid må den bli leid ut til en person
        if(type.isBlank() || utleid && leietaker.isBlank()) return false;

        //Hvis det nye objektet er utleid benytter man seg av en konstruktør med flere parametere
        Hjelpemiddel nyHjelpemiddel = new Hjelpemiddel(type, utleid, leietaker);

        //Bruker en egen metode for å sjekke om objektet finnes, oppnå high chohesion
        if(!hjelpemiddelSjekker(nyHjelpemiddel)) return false;

        else {
            //Legger til objektet i listen og returnerer etterpå
            utstyr.add(nyHjelpemiddel);
            return true;
        }

        /*
        Tenkt registrering av objekter med to konstruktører, burde slettes for clean code
        */
        /*
        else {
            //Hvis det nye objektet ikke et utleid bruker den en konstruktør uten leietaker
            Eksamen.Hjelpemiddel nyHjelpemiddel = new Eksamen.Hjelpemiddel(type, utleid);

            //Bruker en egen metode for å sjekke om objektet finnes
            if(!hjelpemiddelSjekker(nyHjelpemiddel)) return false;
            else {
                //Legger til objektet i listen og returnerer etterpå
                utstyr.add(nyHjelpemiddel);
                return true;

            }
        } */
    }


    /**
     * Sjekker om to objekter er like med bruk av equals metode
     * @param h, Eksamen.Hjelpemiddel
     * @return true/false
     */
    //Metoden ble laget for å lettere avskilde og separere oppgavene til de ulike metodene, High Chohesion
    private boolean hjelpemiddelSjekker(Hjelpemiddel h) {
        //Tar inn objekt av typen Eksamen.Hjelpemiddel og bruker equalsmetoden for å sjekke likhet

        for(Hjelpemiddel hM : utstyr) {
            if(hM.equals(h)) return false;
        }
        return true;
    }


    /**
     * Registrer uteleier boolean.
     *
     * @param type, String
     * @param id, int
     * @param utleier the utleier
     * @return boolean
     */
    /*Tanken er at denne skal finne et objekt utifra input fra bruker
    * og sjekke at det objektet ikke er leid, så skal den lage et nytt objekt
    * med den andre konstruktøren og registrere utleier*/
    public boolean regUteleier(String type, int id, String utleier) {
        //Bruker søke metoden for å få et objekt som man kan endre på
        Hjelpemiddel nyHm = hjelpemiddelFinner(type, id);

        //Sjekker at objektet ikke er null og at det ikke er utleid
        if(nyHm == null) return false;
        if(nyHm.isUtleid()) return false;

        //nyHm = new Eksamen.Hjelpemiddel(type, utleid, utleier); //Endret på denne til å bare bruke EN konstruktør

        //Setter ny verdier
        nyHm.setUtleid(true);
        nyHm.setLeietaker(utleier);
        return true;
    }


    /**
     * Finner et objekt som stemmer med inputen og returnerer dette
     * @param type, String
     * @param id, int
     * @return hM, Eksamen.Hjelpemiddel
     */
    private Hjelpemiddel hjelpemiddelFinner(String type, int id) {
        //Looper gjennom listen med hjelpemiddel og returnerer et objekt hvis det stemmer med input
        for(Hjelpemiddel hM : utstyr) {
            if(hM.getId() == id && hM.getType().equalsIgnoreCase(type)) return hM;
        }
        return null;
    }


    /**
     * Finner hjelpemiddel registrert på person og returner objektet
     * @param type, String
     * @param leietaker, String
     * @return hM, Eksamen.Hjelpemiddel
     */
    private Hjelpemiddel hjelpemiddelPerson(String type, String leietaker) {
        //Looper gjennom listen med hjelpemiddel og returnerer et objekt som stemmer med input
        for(Hjelpemiddel hM : utstyr) {
            if(hM.getLeietaker().equals(leietaker) && hM.getType().equalsIgnoreCase(type)) return hM;
        }
        return null;
    }


    /**
     * Avslutter leie for en person
     *
     * @param type, String
     * @param leietaker, String
     * @return boolean
     */
    public boolean avsluttLeie(String type, String leietaker) {
        //Bruker sokemetode for å finne hjelpemiddlet som er leid ut til personen og bruker objektet metoden returnerte
        Hjelpemiddel nyHm = hjelpemiddelPerson(type, leietaker);
        //Sjekker at objektet ikke er null
        if(nyHm == null) return false;
        //Setter ny verdier
        nyHm.setUtleid(false);
        nyHm.setLeietaker("");
        return true;
    }


    /**
     * List alle Hjelpemiddler
     *
     * @return string
     */
    public String listAlle() {
        //Bruker toString metoden definert i Eksamen.Hjelpemiddel
        //Usikker om dette er OK innenfor GDPR men la gå
        return "Registrert utstyr: \n" + utstyr.toString().replaceAll("\\[", "").replaceAll("]", "").replaceAll(",", "");
    }


    /**
     * List ledige Hjelpemiddler
     *
     * @return  string
     */
    public String listLedige() {
        ArrayList<Hjelpemiddel> ledige = new ArrayList<>();

        //Sjekker hvilke hjelpemiddler   som er ledig og legger det til i en liste
        for(Hjelpemiddel hM : utstyr) {
            if(!hM.isUtleid()) ledige.add(hM);
        }
        return ledige.toString().replaceAll("\\[", "").replaceAll("]", "").replaceAll(",", "");
    }
}
