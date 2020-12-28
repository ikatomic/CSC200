import java.util.Scanner;

public class WordFrequenceis{

  public static void main(String[] args) {

    Scanner in =new Scanner(System. in );

    int n = in.nextInt();

    String[] words = new String[n];

    for (int i = 0; i < words.length; i++) {

      words[i] = in.next();

    }

    int count;

    for (int i = 0; i < words.length; i++) {

      count = 0;

      for (int j = 0; j < words.length; j++) {

        if (words[i].equals(words[j])) {

          ++count;

        }

      }

      System.out.println(words[i] + " " + count);

    }

  }

}