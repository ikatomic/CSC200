import java.util.Scanner;

public class RocketHeight{
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int rocketHeight = 0; 
      int initialVelocity = scnr.nextInt();
      int timeSinceLaunch = 0;
      int counter= 0;

      while(rocketHeight>=0){
       rocketHeight = (initialVelocity * timeSinceLaunch) - (5 * timeSinceLaunch * timeSinceLaunch);
        if (rocketHeight<0)
         break;
       System.out.print(timeSinceLaunch + " ");
       System.out.print(rocketHeight);
       System.out.println();
       timeSinceLaunch = timeSinceLaunch+1;
         if (rocketHeight<0)
         break;

      }
   }
}