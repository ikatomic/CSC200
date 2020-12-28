import java.util.Scanner;

public class RemoveSpacesMethods{
    
    public static String removeSpaces(String userString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < userString.length(); ++i) {
            if (userString.charAt(i) != ' ') {
                result.append(userString.charAt(i));
            }
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(removeSpaces(in.nextLine()));
    }
}