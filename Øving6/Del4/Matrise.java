import java.util.Arrays;

class Matrise{
    static int[][] matrA = { {8, 3},
                             {6, 2}}; //2x2 matrise

    static int[][] matrB = { {3, 7},
                             {2, 6}}; //2x2 matrise 
    static double[][] sumMatr;
    static double[][] sumMatrA;
    static double[][] sumMatrB;
    
    public static double start() {
        int sum = 0;
        System.out.println("Matrise A:");
        for(int i = 0; i < matrA.length; i++) {
            System.out.println(Arrays.toString(matrA[i]));
        }
        System.out.println("Matrise B:");
        for(int i = 0; i < matrB.length; i++) {
            System.out.println(Arrays.toString(matrB[i]));
        }
        return sum;
    }


    public static double addisjon() {
        int sum = 0;
        int Ax = matrA.length;
        int Ay = matrA[0].length;
        int Bx = matrB.length;
        int By = matrB[0].length;
        
        if(Ax == Bx && Ay == By) {
            sumMatr = new double[Ax][By];
            for(int i = 0; i < Ax; i++) {
                for(int j = 0;j < By; j++) {
                sum = matrA[i][j] + matrB[i][j];
                //System.out.println(sum);
                sumMatr[i][j] = sum;
                //System.out.println(Arrays.deepToString(sumMatr));
                sum = 0;
                }
            }
            //System.out.println("Addisjon: " + Arrays.deepToString(sumMatr)); styggere måte å skrive ut
            for(int i = 0; i < sumMatr.length; i++) {
                System.out.println(Arrays.toString(sumMatr[i]));
            }
        }
        else {
            System.out.println("Storrelsen pa matrisen stemmer ikke. Den ene er: " + Ax + "X" + Ay + ". Den andre er: " + Bx + "X" + By);
        }
        return sum;
        
    }

    public static double multipisering() {
        int sum = 0;
        int Ax = matrA.length;
        int Ay = matrA[0].length;
        int Bx = matrB.length;
        int By = matrB[0].length;

        if(Ay == Bx) {
            sumMatr = new double[Ax][By];
            for(int i = 0; i < Ax; i++) {
                for(int j = 0; j < Bx; j++) {
                    for(int k = 0; k < By; k++) {
                        sum = sum + matrA[i][k] * matrB[k][j];
                        sumMatr[i][j] = sum;
                        
                    }
                    sumMatr[i][j] = sum;
                    sum = 0;
                }
            }
            //System.out.println("Multiplikasjon: " + Arrays.deepToString(sumMatr)); //Styggere metode å skrive ut
            for(int i = 0; i < sumMatr.length; i++) {
                System.out.println(Arrays.toString(sumMatr[i]));
            }
        }
        else {
            System.out.println("Storrelsen pa matrisen stemmer ikke. Den ene er: " + Ax + "X" + Ay + ". Den andre er: " + Bx + "X" + By);
        }
        return sum;     
    }


    public static double transponering() {
        int sum = 0;
        int Ax = matrA.length;
        int Ay = matrA[0].length;
        int Bx = matrB.length;
        int By = matrB[0].length;
        sumMatrA = new double[Ay][Ax];
        sumMatrB = new double[By][Bx];
        for(int i = 0; i < Ax; i++) {
            for(int j = 0; j < Ay; j++) {
                //System.out.println("I : " +i );
                //System.out.println("J : " + j );
                sumMatrA[j][i] = matrA[i][j];
                
                //System.out.println(Arrays.deepToString(sumMatrA));
                //System.out.println(Arrays.deepToString(matrA));
            }
        }
        for(int i = 0; i < Bx; i++) {
            for(int j = 0; j < By; j++) {
                //System.out.println("I : " +i );
                //System.out.println("J : " + j );
                sumMatrB[j][i] = matrB[i][j];
                
                //System.out.println(Arrays.deepToString(sumMatrA));
                //System.out.println(Arrays.deepToString(matrA));
            }
        }

        System.out.println("Matrise A: ");
        for(int i = 0; i < sumMatrA.length; i++) {
            System.out.println(Arrays.toString(sumMatrA[i]));
        }
        System.out.println("Matrise B: ");
        for(int i = 0; i < sumMatrB.length; i++) {
            System.out.println(Arrays.toString(sumMatrB[i]));
        }
        //System.out.println("Transponert A : " + Arrays.deepToString(sumMatrA));
        //System.out.println("Transponert B : " + Arrays.deepToString(sumMatrB));
        return sum;
    }

}