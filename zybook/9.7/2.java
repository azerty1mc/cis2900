import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      while (true) {
         System.out.println("Enter input string:");
         String input = scnr.nextLine();

         if (input.equals("q")) {
            break;
         }

         int commaIndex = input.indexOf(',');

         if (commaIndex == -1) {
            System.out.println("Error: No comma in string.");
            System.out.println();
            continue;
         }

         String firstWord = input.substring(0, commaIndex).trim();
         String secondWord = input.substring(commaIndex + 1).trim();

         System.out.println("First word: " + firstWord);
         System.out.println("Second word: " + secondWord);
         System.out.println();
      }
   }
}
