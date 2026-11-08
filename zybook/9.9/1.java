import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      Scanner inFS = null;
      FileInputStream filestream = null;
      String filename = scnr.next();

      filestream = new FileInputStream(filename);
      inFS = new Scanner(filestream);

      while (inFS.hasNextLine()) {
         String park = inFS.nextLine();
         String park_replaced = park.replace("photo.jpg","info.txt");
         System.out.println(park_replaced);
      }
      inFS.close();
   }
}
