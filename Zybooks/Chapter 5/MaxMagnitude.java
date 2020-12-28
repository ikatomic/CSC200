public class MaxMagnitude{
  public static int maxMagnitude(int userVal1, int userVal2) {
    if (Math.abs(userVal1) > Math.abs(userVal2)) return userVal1;
    else return userVal2;
  }
  public static void main(String[] args) {

    int userVal1,
    userVal2;
    Scanner input = new Scanner(System. in );

    userVal1 = input.nextInt();

    userVal2 = input.nextInt();

    System.out.println(maxMagnitude(userVal1, userVal2));
  }
}