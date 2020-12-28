import java.util.Scanner;
public class MaxMinNum{

  public static void main(String[] args) {
    Scanner in =new Scanner(System. in );

    int num1 = in.nextInt(); // enter 1st number

    int num2 = in.nextInt(); // enter 2nd number

    int num3 = in.nextInt(); // enter 3rd number
    System.out.print("largest: " + largestNumber(num1, num2, num3) + "\n");
    System.out.print("smallest: " + smallestNumber(num1, num2, num3) + "\n");

  }

  public static int largestNumber(int num1, int num2, int num3) {
    return Math.max(Math.max(num1, num2), num3);
  }
  public static int smallestNumber(int num1, int num2, int num3) {
    return Math.min(Math.min(num1, num2), num3);

  }
}