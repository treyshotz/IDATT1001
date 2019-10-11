//import java.util.Calendar;


public final class Person {
    final String fornavn;
    final String etternavn;
    final int dato;
    
    public Person(String fNavn, String eNavn, int fDato) {
        fornavn = fNavn;
        etternavn = eNavn;
        dato = fDato;

    }

    public String getNavn() {
        return fornavn + etternavn;
    }

    public int getDato() {
        return dato;
    }
}