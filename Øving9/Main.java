import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

class Main {

    private static Student Thomas = new Student("Thomas");
    private static Student Jonathan = new Student("Jonathan");
    private static Student Mads = new Student("Mads");
    private static List<Student> studenter = new LinkedList<>();
    

    private static Scanner s = new Scanner(System.in);
    public static void main(String [] args) {

        studenter.add(Thomas);
        studenter.add(Mads);
        studenter.add(Jonathan);

        System.out.println("Velkommen");
        meny();
    }

    public static void meny() {
        Oppgaveoversikt studReg = new Oppgaveoversikt(studenter);
        while(true) {
            System.out.println("Du kan velge mellom: \n" + 
                                "0. Avslutt \n" +
                                "1. Finn antall studenter registert\n" + 
                                "2. Finn antall oppgaver løst av student x \n" +
                                "3. Registrere en ny student\n" +
                                "4. øk antall oppgave lost for student x\n");
            int valg = s.nextInt();
            switch(valg) { 
                case 0:
                    System.out.println("Avslutter....");
                    System.exit(0);
                case 1: 
                    System.out.println("Antall studenter registrert er: " + studReg.antRegStud());
                    break;
                case 2: 
                    System.out.println("Antall oppgaver løst av student x ");
                    s.nextLine();
                    String name = s.nextLine();
                    System.out.println("Antall oppgaver løst av "+ name + ": " + studReg.finnOppgLost(name) + "\n");
                    name = "";
                    break;
                case 3: 
                    System.out.println("Registrer en ny student\n");
                    System.out.println("Navn på den nye studenten");
                    s.nextLine();
                    String navn = s.nextLine();
                    Student nyStud = new Student(navn);
                    System.out.println("Registrerer en " +  nyStud.getNavn() + ": " + studReg.registrerNyStudent(nyStud) + "\n");
                    break;
                case 4: 
                    System.out.println("øk antall oppgaver løst for student x");
                    s.nextLine();
                    name = s.nextLine();
                    //System.out.println("Navn: " + name);
                    System.out.println("Hvor mange oppgaver vil du øke med? \n");
                    int antall = s.nextInt();
                    studReg.okAntallOppgaver(name, antall);
                    //studReg.okAntallOppgaver(Mads, antall);
                    break;
                default:
                    System.out.println("Du skrev noe feil, prøv pø nytt. \n");
                    continue;
            }

        }
    }
}