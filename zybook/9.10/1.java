import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      
      String filename = scnr.next();
      FileInputStream instream = new FileInputStream(filename);
      Scanner inFS = new Scanner(instream);
      FileOutputStream outstream = new FileOutputStream("report.txt");
      PrintWriter outFS = new PrintWriter(outstream);

      int rowCount = 0;
      while (inFS.hasNext()) {
         String input = inFS.nextLine();
         rowCount++;
      }

      inFS.close();

      String[][] student_array = new String[rowCount][6];

      FileInputStream instream2 = new FileInputStream(filename);
      Scanner inFS2 = new Scanner(instream2);
      
      for (int i=0; i < rowCount; ++i) { // for each row

         String input = inFS2.nextLine();
         String[] student_data = input.split("\\s+");

         int Midterm1 = Integer.parseInt(student_data[2]);
         int Midterm2 = Integer.parseInt(student_data[3]);
         int Final = Integer.parseInt(student_data[4]);

         int sum = Midterm1 + Midterm2 + Final;
         double average = sum / 3.0;
         String grade = "";

         if (average >= 90) grade = "A";
         else if (average >= 80) grade = "B";
         else if (average >= 70) grade = "C";
         else if (average >= 60) grade = "D";
         else if (average < 60) grade = "F";
            
         student_array[i][0] = student_data[0];
         student_array[i][1] = student_data[1];
         student_array[i][2] = student_data[2];
         student_array[i][3] = student_data[3];
         student_array[i][4] = student_data[4];

         student_array[i][5] = grade;
      }
      inFS2.close();
   
      int mid1_sum = 0;
      int mid2_sum = 0;
      int final_sum = 0;

      for (int i = 0; i < student_array.length; i++) {
         mid1_sum += Integer.parseInt(student_array[i][2]);
         mid2_sum += Integer.parseInt(student_array[i][3]);
         final_sum += Integer.parseInt(student_array[i][4]);

         for (int j = 0; j < student_array[i].length; j++) {
            outFS.print(student_array[i][j]);

            if (j < student_array[i].length - 1) {
               outFS.print("\t");
            }
         }

         outFS.println();
      }

      double mid1_avg = (double) mid1_sum / student_array.length;
      double mid2_avg = (double) mid2_sum / student_array.length;
      double final_avg = (double) final_sum / student_array.length;

      outFS.println();
      outFS.printf(
         "Averages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f%n",
         mid1_avg, mid2_avg, final_avg
      );

      outFS.close();
   }
}
