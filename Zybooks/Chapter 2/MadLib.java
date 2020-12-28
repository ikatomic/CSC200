import java.util.Scanner; 

public class MadLib{
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String firstName = scnr.next();
      String genericLocation = scnr.next();
      int wholeNumber = scnr.nextInt();
      String pluralNoun = scnr.next();
   
      /* Type your code here. */
   
      System.out.println(firstName + " went to " + genericLocation + " to buy " + wholeNumber + " different types of " + pluralNoun + ".");
   }
}
