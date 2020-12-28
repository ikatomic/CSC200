import java.util.Scanner;

public class OutputValuesMethods{

   public static void getUserValues(int[] myArr, int arrSize, Scanner scnr) {
        for (int i = 0; i < arrSize; i++) {
            myArr[i] = scnr.nextInt();
        }
    }

    public static void outputIntsLessThanOrEqualToThreshold(int[] userValues, int userValsSize, int upperThreshold) {
        for (int i = 0; i < userValsSize; ++i) {
            if (userValues[i] <= upperThreshold) {
                System.out.print(userValues[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numValues = scnr.nextInt();
        int[] userValues = new int[numValues];
        getUserValues(userValues, numValues, scnr);
        int threshold = scnr.nextInt();
        outputIntsLessThanOrEqualToThreshold(userValues, numValues, threshold);
   }
}