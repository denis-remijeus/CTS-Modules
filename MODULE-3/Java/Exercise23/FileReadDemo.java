import java.io.*;

public class FileReadDemo {
   public static void main(String[] z) {
      File f = new File("output.txt");
      if (!f.exists()) f = new File("../Exercise22/output.txt");
      try (BufferedReader br = new BufferedReader(new FileReader(f))) {
         System.out.println("file content:");
         String line;
         while ((line = br.readLine()) != null) System.out.println(line);
      } catch (IOException e) {
         System.out.println("read err: " + e.getMessage());
         System.out.println("run Exercise22 first");
      }
   }
}
