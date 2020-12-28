import java.util.Scanner;
import java.util.Random;

public class FlipACoin{
    
    public static String headsOrTails(Random rand) {
        if (rand.nextInt(2) == 0){
            return "heads";
        }
        else {
            return "tails";
        }
        }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(2);
        
        int n = scnr.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(headsOrTails(rand));
        }
    }
}