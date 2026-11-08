import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      String filename = scnr.next();

      FileInputStream filestream = new FileInputStream(filename);
      Scanner inFS = new Scanner(filestream);

      while (inFS.hasNextLine()) {
         String park = inFS.nextLine();
         String parkReplaced = park.replace("_photo.jpg", "_info.txt");

         System.out.println(parkReplaced);
      }

      inFS.close();
   }
}
