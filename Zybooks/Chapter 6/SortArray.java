import java.util.Scanner;

public class SortArray{

    public static void SortArray(int[] myArr, int arrSize) {
        int temp;
        for(int i = 0; i < arrSize; ++i) {
            for(int j = 0; j < arrSize-1; ++j) {
                if(myArr[j] > myArr[j+1]) {
                    temp = myArr[j];
                    myArr[j] = myArr[j+1];
                    myArr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = in.nextInt();
        }
        SortArray(arr, arr.length);
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}