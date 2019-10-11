import java.text.DecimalFormat;

class Analyse {
        
        int[] antallTegn;
        private String tekst;
        private char finnbokstav;
        int[] teller = new int [250];

        /* TODO
Done        1. lage en konstruktør som tar imot input og analyserer den
Done        2. lag en metode som teller antall bokstaver 
Done        3. lag en metode som teller antall forekomster av hver enkelt bokstav. Se hvordan man løser æ ø å        
Done        4. lag en metode som teller ting som ikke er bokstav
        
        PROGRAMMET SKAL GJØRE:
        • Finn antall forskjellige bokstaver i teksten. Her ser vi altså bort fra alle andre tegn enn bokstaver.
Done        • Finn totalt antall bokstaver i teksten.
Done        • Hvor stor del av teksten (prosent) er ikke bokstaver?
        • Finn antall forekomster av en bestemt bokstav. Bokstaven skal være parameter til metoden.
        • Hvilken – eller hvilke, om det er flere som forekommer like ofte – bokstaver forekommer oftest i teksten?
        
        */

        
        public Analyse(String tekst) { //Konstruktør som tar imot tekst
             this.tekst = tekst;  
        }

        /*public Finnbokstav(char finnbokstav) { //Konstruktør for å finne bokstav
            this.finnbokstav = finnbokstav;
        }*/

        public int length() { //Metode som teller lengden på stringen 
            String tekst = this.tekst;
            tekst = tekst.trim();
            int lengde = tekst.length();
            return lengde;
        }

        public void Analyse(){

            for (int i = 0; i < tekst.length(); i++){
        
              char tegn = tekst.charAt(i);
              int verdi = tegn;
            //  System.out.println("UniCode-verdien til tegnet " + tegn + " på posisjon " + i + " er " + verdi);
        
              if(verdi >= (int)'a' && verdi <=(int)'z'){
                antallTegn[verdi-(int)'a'] ++;
              } else if(verdi >= (int)'A' && verdi <=(int)'Z'){
                 antallTegn[verdi-(int)'A'] ++;
              } else if(verdi == 230 || verdi == 198){ // æ eller Æ
                antallTegn[26]++;
              } else if(verdi == 248 || verdi == 216){ // ø eller Ø
                antallTegn[27]++;
              } else if(verdi == 229 || verdi == 197){ // å eller Å
                 antallTegn[28]++;
              } else{
                 antallTegn[29]++;
              }
            }
          }

          public int antallUlikebokstaver() {
                int ulikeTeller = 0;

                for (int i = 0; i < antallTegn.length-2; i++) {
                    if(antallTegn[i]!=0){
                    //  System.out.println((char)(i+(int)'a'));
                      ulikeTeller++;
                    }
                }
                return ulikeTeller;
          }


        public double symboler() { //Metode som finner antall symboler det er i teksten
            String trimmer = tekst.replaceAll("[^a-zA-Z]", "");
            double lengde = tekst.length();
            double trimmetlengde = trimmer.length();
            double antallsymboler = (((lengde - trimmetlengde)/ lengde) * 100);
            DecimalFormat df = new DecimalFormat("#.#");
            return antallsymboler;
        }

        public void forekomster() {
            int lengde = tekst.length();
            
            for (int i = 0; i < lengde; i++) {
                teller[tekst.charAt(i)]++;
            }

            char[] bokstav = new char[tekst.length()];
            int teller1 = 0;
            for (int i = 0; i < lengde; i++) {
                bokstav[i] = tekst.charAt(i);
                int finn = 0;
                for (int j = 0; j <= i; j++) {
                    if (tekst.charAt(i) == bokstav[j]) {
                        finn++;
                    }
                }

                if (finn == 1) {
                    System.out.println("Bokstaven '" + tekst.charAt(i) + "' forekommer: " + teller[tekst.charAt(i)]);
                    
                    teller1++;
                }
            }            
        }

        public int bokstavforekomst() {
            int lengde = this.tekst.length();
            char bokstav = this.finnbokstav;
            int bokstavteller = 0;

            for (int i = 0; i < lengde; i++) {
                bokstavteller += antallTegn[i];
            }
            return bokstavteller;
        }
    }