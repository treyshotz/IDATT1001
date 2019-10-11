import java.util.LinkedList;
import java.util.List;

import javax.naming.LinkException;

class Oppgaveoversikt{
    private List<Student> studenter;
    private int antallStud;

    public Oppgaveoversikt(List<Student> studenter) {
        this.studenter = new LinkedList<>(studenter);
        antallStud=studenter.size();
    }


    public int finnOppgLost(String navn1) {
        if (navn1 == null) {
            return -1;
        }
        Student stud = queryStudent(navn1);
        int pos = finnStudent(stud.getNavn());
        return this.studenter.get(pos).getAntOppg();
    }
    

    public int finnStudent(Student stud) {
        return this.studenter.indexOf(stud);
    }


    private int finnStudent(String navn) {
        for(int i=0; i<this.studenter.size(); i++) {
            //System.out.println(studenter.get(i).getNavn() + navn);
            //System.outpri.ntln("Linje 32 " + i);
            //Student student = studenter.get(i);
            if(studenter.get(i).getNavn().equals(navn)) {
                return i;
            }
        }
        return -1;
    }


    public boolean registrerNyStudent(Student s) {
        return this.studenter.add(s);
    }


    public int antRegStud() {
        return this.studenter.size();
    }


    public boolean okAntallOppgaver(Student s, int antall) {
        if (s == null || antall < 0) {
            return false;
        }
        //System.out.println("Jeg kom her ");
        this.studenter.get(finnStudent(s)).okAntOppg(antall);
        return true;
    }


    public boolean okAntallOppgaver(String navn, int antall) {
        Student s = queryStudent(navn);
        //System.out.println("Linje 59 " + s);
        return okAntallOppgaver(s, antall);
    }


    public Student queryStudent(String navn) {
        int pos = finnStudent(navn);
        //System.out.println("Pos: " + pos);
        if(pos >= 0) {
            return this.studenter.get(pos);
        }

        return null;
    }

}