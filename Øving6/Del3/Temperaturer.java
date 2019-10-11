import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Temperaturer{
    static int[][] temp = { {2, 2, 4, 4}, {3, 3, 4, 4}, {10, 10, 15, 15}, {20, 20, 15, 15} };
    static List<Double> dagArr= new ArrayList<>();

    public static double mndTemp() {
        int teller = 0;
        double sum = 0;
        for(int i = 0; i < temp.length; i++) {
            for(int j = 0; j < temp[i].length; j++) {
                sum = sum+temp[i][j];
                teller++;
            }
        }
        return sum / teller;
    }

    public static double dagTemp() {
        double gjennomsnitt = 0;
        double sum = 0;
        

        for(int i = 0; i < temp.length; i++) {
            for(int j = 0; j < temp[i].length; j++) {
                sum = sum+temp[i][j];
            }
            gjennomsnitt = sum / temp[i].length;
            dagArr.add(gjennomsnitt);

            
            System.out.println("Gjennomsnitt for dag " + (i+1) + " er " + gjennomsnitt);
            //System.out.println(Arrays.toString(dagArr.toArray()));
            sum = 0;
        }
        return sum;
    }

    public static double tempTime() {
        double gjennomsnitt = 0;
        double sum = 0;
        for(int i = 0; i < temp[0].length; i++) {
            for(int j = 0; j < temp.length; j++) {
                sum += temp[j][i];
            }
            gjennomsnitt = sum / temp.length;
            System.out.println("Gjennom snitt for time " + (i+1) + " er " + gjennomsnitt);
            sum = 0;
        }
        return sum;
    }

    
    public static double sorter() {
        int sum = 0;
        for(int i = 0; i < dagArr.size(); i++) {
           if(dagArr.get(i) < -5) {
               System.out.println("Det er mindre enn -5 grader dag nr " + (i+1));
           }
           if(dagArr.get(i) <= -5 && dagArr.get(i) <= 0) {
               System.out.println("Det er mellom -5 og 0 grader dag nr " + (i+1));
           }
           else if(dagArr.get(i) > 0 && dagArr.get(i) <= 5) {
               System.out.println("Det er mellom 0 og 5 grader dag nr " + (i+1));
           }
           else if(dagArr.get(i) > 5 && dagArr.get(i) <= 10) {
               System.out.println("Det er mellom 5 og 10 grader dag nr " + (i+1));
           }
           else if(dagArr.get(i) > 10) {
               System.out.println("Det er mer enn 10 grader dag nr " + (i+1));
           }
        }
        return sum;
    }
}