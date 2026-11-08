import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      String filename = scnr.next();

      FileInputStream fileStream = new FileInputStream(filename);
      Scanner inFS = new Scanner(fileStream);

      FileOutputStream outputStream = new FileOutputStream("report.txt");
      PrintWriter outFS = new PrintWriter(outputStream);

      int studentCount = 0;
      int midterm1Sum = 0;
      int midterm2Sum = 0;
      int finalSum = 0;

      while (inFS.hasNext()) {
         String lastName = inFS.next();
         String firstName = inFS.next();
         int midterm1 = inFS.nextInt();
         int midterm2 = inFS.nextInt();
         int finalExam = inFS.nextInt();

         double studentAverage =
            (midterm1 + midterm2 + finalExam) / 3.0;

         String grade;

         if (studentAverage >= 90) {
            grade = "A";
         }
         else if (studentAverage >= 80) {
            grade = "B";
         }
         else if (studentAverage >= 70) {
            grade = "C";
         }
         else if (studentAverage >= 60) {
            grade = "D";
         }
         else {
            grade = "F";
         }

         outFS.printf("%s\t%s\t%d\t%d\t%d\t%s%n",
                      lastName, firstName, midterm1, midterm2,
                      finalExam, grade);

         midterm1Sum += midterm1;
         midterm2Sum += midterm2;
         finalSum += finalExam;
         studentCount++;
      }

      double midterm1Average = (double) midterm1Sum / studentCount;
      double midterm2Average = (double) midterm2Sum / studentCount;
      double finalAverage = (double) finalSum / studentCount;

      outFS.printf("Averages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f%n",
                   midterm1Average, midterm2Average, finalAverage);

      inFS.close();
      outFS.close();
   }
}
