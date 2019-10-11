
class Analyse {
    static int[] teller;
    String tekst;
    int antall;

    public Analyse(String tekst) {
        this.tekst = tekst;
        teller = new int[30];
        analysen();
    }

    public void analysen() {
        for(int i = 0; i < tekst.length(); i++) {
            teller[i] = 0;
            
        }

        for(int i = 0; i < tekst.length(); i++) {

            char tegn = tekst.charAt(i);
            int verdi = tegn;
            //System.out.println(verdi);

            if(verdi >= (int)'a' && verdi <=(int)'z'){
                teller[verdi-(int)'a'] ++;
              } else if(verdi >= (int)'A' && verdi <=(int)'Z'){
                 teller[verdi-(int)'A'] ++;
              } else if(verdi == 8216 || verdi == 8217){ // æ-230 / Æ-198
                teller[26]++;
              } else if(verdi == 8250 || verdi == 65533){ // ø-248 / Ø-216
                teller[27]++;
              } else if(verdi == 8224 || verdi == 65533){ // å-229 / Å-197
                 teller[28]++;
              } else{
                 teller[29]++;
            }
        }
    }

    public int lengde() { //Metode som teller lengden på stringen 
        String tekst = this.tekst;
        tekst = tekst.trim();
        int lengde = tekst.length();
        return lengde;
    }
    public int ulike() { //Ulike viser ikke tall
        int antall = 0; 

        for(int i = 0; i < teller.length-1; i++) {
            if(teller[i] != 0) {
                //System.out.println((char)(i+(int)'a'));
                antall++;
            }  
        }
        return antall;
    }
    
    public int bokstaver() {
        int antall = 0;

        for(int i = 0; i < teller.length-1; i++) {
            antall += teller[i];
        }
        return antall;
    }

    public double symboler() {
        double bokstav = bokstaver();
        double ikkebokstav = teller[29];

        double prosent = ikkebokstav/(bokstav+ikkebokstav)*100;
        return prosent;
    }

    public int antallGanger(String bokstav) {
        if(bokstav.length() == 1) {

            char tegn = bokstav.charAt(0);
            int verdi = tegn;

            if(verdi >= (int)'a' && verdi <=(int)'z'){
                return teller[verdi-(int)'a'];
                } else if(verdi >= (int)'A' && verdi <=(int)'Z'){
                    return teller[verdi-(int)'A'];
                } else if(verdi == 8216 || verdi == 8217){ // æ / Æ
                return teller[26];
                } else if(verdi == 8250 || verdi == 65533){ // ø / Ø
                return teller[27];
                } else if(verdi == 8224 || verdi == 65533){ // å / Å
                return teller[28];
                } else throw new IllegalArgumentException("Error: Velg en bokstav");

        }else throw new IllegalArgumentException("Error: Skriv inn kun en bokstav");
    }

    public void flestGanger(){
        int hoyest = 0;
        int count = 0;
        char[] tegn = new char[teller.length-1];
        for (int i = 0; i < teller.length-1; i++ ) {
          if(hoyest <= teller[i]){
            hoyest = teller[i];
          }
        }
        for (int x = 0; x < teller.length-1; x++) {
          if( teller[x] == hoyest){
            tegn[count] = (char) (x + 97);
            System.out.print(tegn[count] + " forekommer " + hoyest + " ganger \n");
            count++;
            }
    
          }
        
        if( count > 1) {
            System.out.println("Disse " + count + " forekommer like mange ganger.");
        }
        else {
            System.out.println("og er bokstaven som gjentas flest ganger");
        }
      }
}


