class Main {

    private static final NyString tekst = new NyString("Hei dette �r �n test");
    //private static final NyString bokstav = new NyString('e');

    public static void main(String [] args) {
        System.out.println(tekst.forkort());
        System.out.println(tekst.fjernTegn('e'));
    }
}