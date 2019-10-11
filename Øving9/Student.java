
class Student {
    private String navn;
    private int antOppg;

    
    public Student(String navn) {
        this.navn = navn;
        this.antOppg = 0;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntOppg() {
        return antOppg;
    }

    public void okAntOppg(int antall) {
        this.antOppg += antall;
    }

    public String toString() {
        return "Javell";
    }
}