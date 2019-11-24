import java.util.*;

public class Oving1_3 {
    public static void main(String [] args) {
        int startSeconds = 3661;
        int hours = startSeconds/3600;
        System.out.println("Hours: " + hours);
        int minutes = startSeconds%3600/60;
        System.out.println("Minutes: " + minutes);
        int seconds = startSeconds%3600%60;
        System.out.println("Seconds: " + seconds);
    }
}