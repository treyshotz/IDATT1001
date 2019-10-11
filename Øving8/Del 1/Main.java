import java.util.Scanner;



 /*
• Lage en ny person med fornavn, etternavn, fodselsdato
• Lag en ny arbeidstaker med objekter fra person og ny objekter som arbtakernr, ansettelsesaar, mndlonn, skatteprosent
• Get metoder som gjor at du kan hente ut attributene
• Set metode som gjor at du kan endre 

Meny med folgende
• Hvor mange kroner arbeidstakeren trekkes i skatt per maaned;
• Bruttolonn per aar;
• Skattetrekk per aar. Husk at juni er skattefri og i desember betales halv skatt;
• Navn paa formen: etternavn, fornavn, eksempel: Johnsen, Berit;
• Alder;
• Antall aar ansatt i bedriften;
• Om personen har vært ansatt mer enn et gitt antall aar (parameter); */



public class Main {

    private static Scanner s = new Scanner(System.in);
    static int personTeller = 0;
    static int arbeiderTeller = 0;

    
    public static void main(String [] args) {
        if(personTeller == 0 || arbeiderTeller == 0) {
            System.out.println("Det er ikke registrert noen personer enda");
            meny();
        }        
    }


    public static ArbTaker nyPerson() {
        System.out.println("Legg til en person\n");
        System.out.println("Fornavn: ");
        String fNavn = s.nextLine();
        System.out.println("Etternavn: ");
        String eNavn = s.nextLine();
        System.out.println("Fodselsår: ");
        int fDato = s.nextInt();
        Person person1 = new Person(fNavn, eNavn, fDato);
        personTeller ++;
        System.out.println("Legg til arbeider\n");
        System.out.println("Arbeidstaker nr: ");
        int arbNr = s.nextInt();
        System.out.println("Ansettelses aar: ");
        int ansetaar = s.nextInt();
        System.out.println("Maanedslonn: ");
        double mndLonn = s.nextDouble();
        System.out.println("Skatteprosent: ");
        double skatteprosent = s.nextDouble();
        ArbTaker Arbtaker1 = new ArbTaker(person1,arbNr, ansetaar, mndLonn, skatteprosent);
        arbeiderTeller ++;
        return Arbtaker1;
    }

    public static void meny() {
        ArbTaker arbtaker = nyPerson();
        while(true) {
            System.out.println("Menyen:\n" + 
                                "0. Avslutt\n" +
                                "1. Endre Ansattnr\n" +
                                "2. Endre ansettelsesaar\n" + 
                                "3. Endre maanedslonn\n" + 
                                "4. Endre skatteprosent\n" +
                                "5. Ansattinformasjon\n" +
                                "6. Om personen har vært ansatt i mer enn x antall aar");
            int valg = s.nextInt();
            switch(valg) {
                case 0: 
                    System.out.println("Avslutter....");
                    System.exit(0);
                case 1:
                    System.out.println("Nytt ansattnr: ");
                    int nyttAnsattNr = s.nextInt();
                    arbtaker.setArbeidsNr(nyttAnsattNr);
                    System.out.println("Ansattnr ble endret");
                    break;
                case 2:
                    System.out.println("Nytt ansettelsesaar");
                    int nyttAnsattaar = s.nextInt();
                    arbtaker.setAnsettelsesaar(nyttAnsattaar);
                    System.out.println("Ansettelsesaar ble endret");
                    break;
                case 3:
                    System.out.println("Ny maanedslonn:");
                    double nyMndLonn = s.nextDouble();
                    arbtaker.setMaanedslonn(nyMndLonn);
                    System.out.println("Ny maanedslonn ble satt");
                    break;
                case 4: 
                    System.out.println("Ny skatteprosent");
                    double nySkatteProsent = s.nextDouble();
                    arbtaker.setSkatteProsent(nySkatteProsent);
                    System.out.println("Ny skatteprosent ble satt");
                    break;
                case 5:
                    visAnsattInfo(arbtaker);
                    break;
                case 6:
                    //Om ansatte har vært ansatt i mer enn antall aar
                    System.out.println("Hvor mange aar? ");
                    int aar = s.nextInt();
                    arbtaker.aarIBedrif(aar);
                    break;
                default: 
                    System.out.println("Du skrev noe feil, prov paa nytt.");
                    continue;
            }
        }
    }

    public static void visAnsattInfo(ArbTaker arbtaker) {
        System.out.println("Ansattnr: " + arbtaker.getArbeidsNr());
        System.out.println("Maanedslonn: " + arbtaker.getMaanedsLonn());
        System.out.println("Skatteprosent: " + arbtaker.getSkatteprosent());
        System.out.println("Ansettelsesaar: " + arbtaker.getAnsettelsesaar());
        System.out.println("Aar i brediften: " + arbtaker.getAarIBedrift());
        System.out.println("Alder: " + arbtaker.getAlder());
        System.out.println("Bruttolonn: " + arbtaker.bruttoLonn());
        System.out.println("Navn: " + arbtaker.getNavn());
        System.out.println("Skatt per aar: " + arbtaker.skattPerAar());
        System.out.println("Skatt per mnd: " + arbtaker.skattPerMnd());        
    }

}