import java.util.Scanner;

public class MileToTrackLaps{

  public static double milesToLaps(double userMiles){

    return userMiles * 4;

  }

  public static void main(String[] args)

  {

    Scanner read = new Scanner(System. in );

    double userMiles,
    yourValue;

    userMiles = read.nextDouble();

    yourValue = milesToLaps(userMiles);

    System.out.printf("%.2f", yourValue);

  }

}