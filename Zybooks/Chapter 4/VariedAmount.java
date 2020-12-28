import java.util.Scanner; 

public class VariedAmount{
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
        int count = 0, max = 0, total = 0;

        int num = scnr.nextInt();
        while (num >= 0) {
            count++;
            total += num;
            max = Math.max(max, num);
            num = scnr.nextInt();
        }

        int avg = count == 0 ? 0 : total/count;
        System.out.println(avg + " " + max);
   }
}
