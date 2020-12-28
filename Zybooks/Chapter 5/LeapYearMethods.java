import java.util.Scanner;
public class LeapYearMethods{
  public static boolean isLeapYear(int userYear){
    if(userYear % 4 == 0 && userYear % 100 != 0){
      return true;
    }
    else if(userYear % 400 == 0){
      return true;
    }
    return false;
  }

  public static void main(String args[]){
    int year;
    Scanner scanner = new Scanner(System.in);
    year = scanner.nextInt();
    if(isLeapYear(year)){
      System.out.println(year+" is a leap year.");
    }
    else{
      System.out.println(year+" is not a leap year.");
    }
  }
}