import java.util.Scanner;

public class OutputRange{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt(), end = in.nextInt();
        if (start > end) {
            System.out.println("Second integer can't be less than the first.");
        } else {
            while (start <= end) {
                System.out.print(start + " ");
                start += 10;
            }
            System.out.println();
        }
    }
}