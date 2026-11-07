import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      // getting scanner input
      Scanner scnr = new Scanner(System.in);

      int word_count = scnr.nextInt();
      String[] string_input = new String[word_count];

      for (int i = 0; i < word_count; ++i) {
         string_input[i] = scnr.next();
      }

      String letter_input = scnr.next();

      String[] words_with_letter = new String[word_count];

      for (int i = 0; i < word_count; ++i) {
         if (string_input[i].contains(letter_input)) {
            System.out.print(string_input[i] + ",");
         }
      }
      
      System.out.println();

      scnr.close();
   }
}
