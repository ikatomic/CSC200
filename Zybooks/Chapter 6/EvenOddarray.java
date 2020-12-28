import java.util.Scanner;

public class EvenOddarray{
    
    public static boolean isArrayEven(int[] arrayValues, int arraySize){

    for(int i = 0; i <= arraySize -1; i++)
    {
        if(arrayValues[i] % 2 != 0)
        {
            return false;
        }
    }
    return true;
}

public static boolean isArrayOdd(int[] arrayValues, int arraySize){

    for(int i = 0 ; i < arraySize ; i++)
    {
        if(arrayValues[i] % 2 == 0)
        {
            return false;
        }
    }
    return true;
}

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int arraySize = scan.nextInt();             
        int[] arrayValues = new int[arraySize];     

        for(int i = 0; i <= arraySize-1; i++)
        {
            arrayValues[i] = scan.nextInt();
        }
        
        if(isArrayEven(arrayValues,arraySize) == true)
        {
            System.out.println("all even");
        }else if(isArrayOdd(arrayValues,arraySize) == true)
        {
            System.out.println("all odd");
        }else if(isArrayEven(arrayValues,arraySize) == false && isArrayOdd(arrayValues,arraySize) == false)
        {
            System.out.println("not even or odd");
        }
      }
    }