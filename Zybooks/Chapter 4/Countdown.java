import java.util.Scanner;

public class Countdown{
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userDigit;
      int newDigit;

      userDigit = scnr.nextInt();

      newDigit = userDigit - 1;

      if ((userDigit > 19) && (userDigit < 99)) {
         System.out.print(userDigit + " ");

      }
      else {
         System.out.println("Input must be 20-98");
      }


      while ((userDigit > 19) && (userDigit < 99) && (newDigit % 11 != 0)) {
         if (userDigit % 11 == 0) {
            System.out.println();
            break;
         }
         System.out.print(newDigit + " ");
         --newDigit;

         if (newDigit % 11 == 0) {
            System.out.println(newDigit + " ");
            break;
         }
      }


   }
}
   

