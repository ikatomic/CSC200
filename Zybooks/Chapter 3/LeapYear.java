import java.util.Scanner;

public class LeapYear{

  public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);

      int inputYear;

      inputYear = scnr.nextInt();
      
      if (inputYear % 4 == 0) {
            if ((inputYear % 100 == 00) && (inputYear % 400 == 0)) {
               System.out.println(inputYear + " - leap year");
            } else if ((inputYear % 100 == 00) && (inputYear % 400 != 0)){
            System.out.println(inputYear + " - not a leap year");
            } else {
               System.out.println(inputYear + " - leap year");
            }
      } else {
            System.out.println(inputYear + " - not a leap year");
      }
}
}