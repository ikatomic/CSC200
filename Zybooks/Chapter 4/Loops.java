import java.util.Scanner;
public class Loops{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter an integer:");
        n = scan.nextInt();
      if(n<0) n = -n;

        System.out.print("Sequence: ");
        for(int i=-n ;i<=n ;i++){
            System.out.print(i + " ");
        }

        System.out.println();
        scan.close();
    }
}

