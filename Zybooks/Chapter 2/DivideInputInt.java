import java.util.Scanner;

public class DivideInputInt{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int userNum = input.nextInt();
      int divNum = input.nextInt();


      userNum = userNum / divNum;
      System.out.print(userNum + " ");
      userNum = userNum / divNum;
      System.out.print(userNum + " ");
      userNum = userNum / divNum;
      System.out.print(userNum + "\n");


   }
}