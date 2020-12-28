import java.util.Scanner;

public class Acronyms{
    public static String createAcronym(String userPhrase) {
        String[] words = userPhrase.split(" ");
        String acronymStr = "";
        
        for (int i = 0; i < words.length; i++) {
            if (Character.isUpperCase(words[i].charAt(0)))
            {
                acronymStr = acronymStr + words[i].charAt(0);
            }
            }
        return acronymStr;
        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputStr = input.nextLine();
        
        System.out.println(createAcronym(inputStr));
    }
}