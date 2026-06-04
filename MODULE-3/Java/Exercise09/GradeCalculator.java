import java.util.Scanner;

public class GradeCalculator {
   public static void main(String[] x) {
      Scanner s = new Scanner(System.in);
      System.out.print("marks: ");
      if (!s.hasNextInt()) {
         System.out.println("gimme an int");
         s.close(); return;
      }
      int m = s.nextInt();
      if (m < 0 || m > 100) {
         System.out.println("0-100 pls");
         s.close(); return;
      }
      char g;
      if (m >= 90) g = 'A';
      else if (m >= 80) g = 'B';
      else if (m >= 70) g = 'C';
      else if (m >= 60) g = 'D';
      else g = 'F';
      System.out.println("marks: " + m + " -> grade: " + g);
      s.close();
   }
}
