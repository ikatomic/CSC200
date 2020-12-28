import java.util.Scanner;

public class ModifiedAverage{
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
       int sum = 0;
       int validCount = 0, invalidCount = 0;
       float avg;
       int userInt = scnr.nextInt();


       while (userInt != 0) {
           if (userInt >= 2 && userInt <= 12) {
               sum += userInt;
               validCount++;
           } else {
               invalidCount++;
           }
           userInt = scnr.nextInt();
       }
       if (validCount == 0) {
           System.out.println("Average: 0.0");
           System.out.println("Valid: 0");
           System.out.println("Invalid: 0");
       } else {
           avg = (float) sum / validCount;
           System.out.println("Average: " + avg);
           System.out.println("Valid: " + validCount);
           System.out.println("Invalid: " + invalidCount);
       }
       scnr.close();
   }
}