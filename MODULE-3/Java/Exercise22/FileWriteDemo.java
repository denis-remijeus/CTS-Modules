import java.io.*;
import java.util.Scanner;

public class FileWriteDemo {
   public static void main(String[] x) {
      Scanner s = new Scanner(System.in);
      System.out.print("text to write: ");
      String data = s.nextLine();
      try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
         bw.write(data);
         System.out.println("saved to output.txt");
      } catch (IOException e) {
         System.out.println("write failed: " + e.getMessage());
      }
      s.close();
   }
}
