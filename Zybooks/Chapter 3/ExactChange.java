import java.util.Scanner;

public class ExactChange{
  public static void main(String[] args) {
    Scanner input = new Scanner(System. in );
    int Amount,
    Dollar,
    Quarter,
    Dime,
    Nickel,
    Penny;

    System.out.print("");
    Amount = input.nextInt();

    if (Amount <= 0) {
      System.out.println("No change");
    }

    else

    {

      Dollar = Amount / 100;

      Amount = Amount % 100;

      Quarter = Amount / 25;

      Amount = Amount % 25;

      Dime = Amount / 10;

      Amount = Amount % 10;

      Nickel = Amount / 5;

      Penny = Amount % 5;

      if (Dollar >= 1)

      {

        if (Dollar == 1) {
          System.out.print(Dollar + " Dollar\n");
        }

        else {
          System.out.print(Dollar + " Dollars\n");
        }

      }

      if (Quarter >= 1)

      {

        if (Quarter == 1)

        {
          System.out.print(Quarter + " Quarter\n");
        }

        else {
          System.out.print(Quarter + " Quarters\n");
        }

      }

      if (Dime >= 1)

      {

        if (Dime == 1) {
          System.out.print(Dime + " Dime\n");
        }

        else {
          System.out.print(Dime + " Dimes\n");
        }

      }

      if (Nickel >= 1)

      {

        if (Nickel == 1) {
          System.out.print(Nickel + " Nickel\n");
        }

        else {
          System.out.print(Nickel + " Nickels\n");
        }

      }

      if (Penny >= 1)

      {

        if (Penny == 1) {
          System.out.print(Penny + " Penny\n");
        }

        else {
          System.out.print(Penny + " Pennies\n");
        }

      }

    }

  }

}

   }

}