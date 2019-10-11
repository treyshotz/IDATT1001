class Oving2del2{
  public static void main(String [] args) {
    double PrisA = 35.9;
    double VektA = 0.45;
    double PrisB = 39.5;
    double VektB = 0.5;
    double kiloprisA = PrisA / VektA;
    double kiloprisB = PrisB / VektB;

    System.out.println("Kjottdeig A veier " + VektA + " og koster " + PrisA + "kr");
    System.out.println("Kjottdeig B veier " + VektB + " og koster " + PrisB + "kr");

    if( kiloprisA > kiloprisB) {
      System.out.println("Kjottdeig B er billigst");
    } else{
      System.out.println("Kjottdeig A er billigst");
    }
  }
}
