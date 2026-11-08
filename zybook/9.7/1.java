import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System. in);

      while (true) {
         System.out.println("Enter input string:");
         String input = scnr.nextLine();
         
         if (input.equals("q")) {
            break;
         }

         if (input.contains(",")) {
            String[] words = input.split("\\s*,\\s*");
            System.out.println("First word: " + words[0]);
            System.out.println("Second word: " + words[1]);
            System.out.println();         
         }

         else {
            System.out.println("Error: No comma in string.");
            System.out.println();         
         }
      }
   }
}
