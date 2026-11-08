```java
import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      int commaIndex;

      while (true) {
         System.out.println("Enter input string:");
         input = scnr.nextLine();

         if (input.equals("q")) {
            break;
         }

         commaIndex = input.indexOf(',');

         while (commaIndex == -1) {
            System.out.println("Error: No comma in string.");
            System.out.println();
            System.out.println("Enter input string:");
            input = scnr.nextLine();

            if (input.equals("q")) {
               return;
            }

            commaIndex = input.indexOf(',');
         }

         String firstWord = input.substring(0, commaIndex).trim();
         String secondWord = input.substring(commaIndex + 1).trim();

         System.out.println("First word: " + firstWord);
         System.out.println("Second word: " + secondWord);
         System.out.println();
      }
   }
}
```
