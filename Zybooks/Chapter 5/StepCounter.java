import java.util.Scanner;

public class StepCounter{

   public static double stepsToMiles(int userSteps){
      return ((double)userSteps/2000);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double userSteps= stepsToMiles(scnr.nextInt());
      System.out.printf("%.2f", userSteps);
   }
}