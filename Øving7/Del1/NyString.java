
final class NyString {
    private  String tekst;
    //private static char bokstav;

    
    public NyString(String tekst) {
        this.tekst = tekst;
        //this.bokstav = bokstav;
    }

    public String forkort() {
        //int sum = 0;
        String[] ord = tekst.split(" ");
        String forkort = "";
        for(int i = 0; i < ord.length; i++) {
            forkort += ord[i].charAt(0);
            //System.out.println(s.charAt(0));
        }
        return forkort;
    }

    public String fjernTegn(char bokstav) {    
        return tekst.replaceAll(""+bokstav,"");
    }


}