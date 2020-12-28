import java.util.Scanner;

public class RemoveGrayFromRBG{
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int red = scnr.nextInt();
      int green = scnr.nextInt();
      int blue = scnr.nextInt();

      if (red<blue && red<green)
         System.out.println((red-red) + " " + (green - red) + " " + (blue - red));

      else if (green<red && green<blue)
         System.out.println((red - green) + " " + (green-green) + " " + (blue - green));
      else 
         System.out.println((red - blue) + " " + (green - blue) + " " + (blue-blue));
   }
}