import java.util.Scanner;
public class Jiffy{
  public static double secondsToJiffies(double userSeconds) {
    double numJiffies = 0;
    numJiffies = userSeconds / 0.01;
    return numJiffies;

  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System. in );

    double seconds,
    output;
    seconds = input.nextDouble();
    output = secondsToJiffies(seconds);
    System.out.printf("%.2f", output);

  }
}