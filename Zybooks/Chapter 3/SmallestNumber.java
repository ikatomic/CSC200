import java.util.Scanner;
public class SmallestNumber{

 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        System.out.println(smallest(x, y, z));
    }

   public static int smallest(int x, int y, int z)
    {
        return Math.min(Math.min(x, y), z);
    }
}