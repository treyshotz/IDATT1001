class vare {
    public static final double MOMS = 24.0;
    public static final double MOMSFAKTOR = 1.0 + MOMS /100;

    private final String varenavn;
    private final int varenr;
    private double pris;

    public vare(String varenavn, int varenr, double pris) {
        this.varenavn = varenavn;
        this.varenr = varenr;
        this.pris = 0.0;
    }

    public String getVarenavn() {
        return varenavn;
    }

    public int getVarenr() {
        return varenr;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public double beregnPrisUtenMoms(double kilo) {
        double totalPris = pris * kilo;
        if (kilo > 5) {
            totalPris = totalPris * 0.8;
        }
        else if (kilo > 3) {
            totalPris = totalPris * 0.9;
        }
        return totalPris;
    }

    public double beregnPrisMedMoms (double kilo) {
        double totalPrisMedMoms = beregnPrisUtenMoms(kilo) * MOMSFAKTOR;
        return totalPrisMedMoms;
    }

    public String toString() {
        java.util.Formatter f = new java.util.Formatter();
        f.format("%.2f", pris);
        return varenr + ": " + varenavn + ", pris pr. kg kr " + f.toString() + " u.moms";
    }
}

class Klient2 {
    public static void main(String [] args ) {
        vare vare = new vare("Norgesost", 124, 79.50);
        System.out.println(vare.toString());
        double startKilo = 4.0;
        double prisUMva = vare.beregnPrisUtenMoms(startKilo);
        double prisMMva = vare.beregnPrisMedMoms(startKilo);

        System.out.println("Pris uten MVA = " + prisUMva + "\n Pris med MVA" + prisMMva);



    }
}