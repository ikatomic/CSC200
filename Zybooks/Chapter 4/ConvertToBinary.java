import java.util.Scanner; 

public class ConvertToBinary{
   public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        while (x > 0) {
            System.out.print(x % 2);
            x /= 2;
        }
        System.out.println();
   }
}
