import java.util.Scanner;

public class InterstateHighway{

   public static void main(String[] args) {

       Scanner scnr = new Scanner(System.in);

       int highwayNumber;

       int primaryNumber;

       highwayNumber = scnr.nextInt();

       if(highwayNumber<1 || highwayNumber>999)

           System.out.println(highwayNumber+" is not a valid interstate highway number.");

       else{

           if(highwayNumber>=1 && highwayNumber<=99){

               System.out.print("I-"+highwayNumber+" is primary, going ");

               if(highwayNumber%2==1)

                   System.out.println("north/south.");

               else

                   System.out.println("east/west.");

           }

           else{

               primaryNumber = highwayNumber%100;

               System.out.print("I-"+highwayNumber+" is auxiliary, serving I-"+primaryNumber+", going ");

               if(primaryNumber%2==1)

                   System.out.println("north/south.");

               else

                   System.out.println("east/west.");
           }

       }

   }

}