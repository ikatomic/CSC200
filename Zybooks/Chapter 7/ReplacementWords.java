import java.util.Scanner;

  public class ReplacementWords{

  public static int findWordInWordList(String[] wordList, String wordToFind, int numInList) {

          for (int i = 0; i < numInList; i++) {

              if (wordList[i].equals(wordToFind)) {

                  return i;

              }

          }

          return -1;

      }

      public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);

          String[] original_String = new String[20];

              String[] modified_String = new String[20];

          int numInList = scan.nextInt();

          for (int i = 0; i < numInList; i++) {

              original_String[i] = scan.next();

              modified_String[i] = scan.next();

          }

          int num_Of_Words = scan.nextInt();

          String[] words_To_Replace = new String[num_Of_Words];

          for (int i = 0; i < num_Of_Words; i++) {

              words_To_Replace[i] = scan.next();

          }

          int indx;

          for (int i = 0; i < num_Of_Words; i++) {

              indx = findWordInWordList(original_String, words_To_Replace[i], numInList);

              if (indx != -1)

                  words_To_Replace[i] = modified_String[indx];

          }

          for (int i = 0; i < num_Of_Words; i++)

              System.out.print(words_To_Replace[i] + " ");

          System.out.println();

      scan.close();

      }

  }
