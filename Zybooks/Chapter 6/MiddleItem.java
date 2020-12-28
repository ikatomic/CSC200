import java.util.Scanner; 

public class MiddleItem{
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[9];     

      int numValues;
      int curValue;

      numValues = 0;
      curValue = scnr.nextInt();

      while (curValue != -1) {
         if (numValues == 9) {
            System.out.println("Too many inputs");
               return;
         }
            userValues[numValues++] = curValue;
            curValue = scnr.nextInt();
         }
         if (numValues % 2 == 1) {
            System.out.println(userValues[numValues / 2]);
         }
         else {
            System.out.println(userValues[(numValues - 1) / 2] + " " + userValues[numValues / 2]);
         }
   }
}
