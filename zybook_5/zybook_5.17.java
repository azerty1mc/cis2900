/*
Write a program that reads a list of words.
Then, the program outputs those words and their frequencies.

Input:
5 hey hi Mark hi mark

Output:
hey - 1
hi - 2
Mark - 1
hi - 2
mark - 1

Hint: Use two arrays.
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {

      // getting scanner input
      Scanner input_scan = new Scanner(System.in);
      String input = input_scan.nextLine();

      // using 1st number as length
      String[] input_split = input.split("\\s+");
      int string_count_int = Integer.parseInt(input_split[0]);
      
      int[] words_frequency = new int[string_count_int+1];

      for (int i = 1; i <= string_count_int; i++) {
         int word_freq_int = 0;
         for (int j = 1; j <= string_count_int; j++) {
            if (input_split[i].compareTo(input_split[j]) == 0) {
               word_freq_int = word_freq_int +1;
            }
         }
         words_frequency[i-1] = word_freq_int;
         System.out.println(input_split[i] + " - " + words_frequency[i-1]);
      }
   }
}
