import java.util.Scanner;

public class Seasons{

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       String inputMonth = sc.next();

       int inputDay = sc.nextInt();

       if (inputMonth.equals("January") && inputDay >= 1 && inputDay <= 31)

           System.out.println("Winter");

       else if (inputMonth.equals("February") && inputDay >= 1 && inputDay <= 29)

           System.out.println("Winter");

       else if (inputMonth.equals("April") && inputDay >= 1 && inputDay <= 30)

           System.out.println("Spring");

       else if (inputMonth.equals("May") && inputDay >= 1 && inputDay <= 30)

           System.out.println("Spring");

       else if (inputMonth.equals("July") && inputDay >= 1 && inputDay <= 31)

           System.out.println("Summer");

       else if (inputMonth.equals("August") && inputDay >= 1 && inputDay <= 31)

           System.out.println("Summer");

       else if (inputMonth.equals("October") && inputDay >= 1 && inputDay <= 31)

           System.out.println("Autumn");

       else if (inputMonth.equals("November") && inputDay >= 1 && inputDay <= 30)

           System.out.println("Autumn");

       else if (inputMonth.equals("March") && inputDay >= 20 && inputDay <= 31)

           System.out.println("Spring");

       else if (inputMonth.equals("June") && inputDay >= 1 && inputDay <= 20)

           System.out.println("Spring");

       else if (inputMonth.equals("June") && inputDay >= 21 && inputDay <= 30)

           System.out.println("Summer");

       else if (inputMonth.equals("September") && inputDay >= 1 && inputDay <= 21)

           System.out.println("Summer");

       else if (inputMonth.equals("September") && inputDay >= 22 && inputDay <= 30)

           System.out.println("Autumn");

       else if (inputMonth.equals("December") && inputDay >= 0 && inputDay <= 20)

           System.out.println("Autumn");

       else if (inputMonth.equals("December") && inputDay >= 21 && inputDay <= 30)

           System.out.println("Winter");

       else if (inputMonth.equals("March") && inputDay >= 1 && inputDay <= 19)

           System.out.println("Winter");

       else

           System.out.println("Invalid");

   }

}