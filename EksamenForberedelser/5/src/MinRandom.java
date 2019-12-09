import java.util.*;

public class MinRandom {
        Random r = new Random();

        public int nesteHeltall(int nedre, int ovre) {
            return r.nextInt(ovre-nedre) + nedre;
        }

        public double nesteDesimalTall(double nedre, double ovre) {
            return nedre + (ovre-nedre) *r.nextDouble();
        }


}
