import java.util.Scanner;

public class StringReversal {
   public static void main(String[] p) {
      Scanner s = new Scanner(System.in);
      System.out.print("type something: ");
      String orig = s.nextLine();
      String rev = new StringBuilder(orig).reverse().toString();
      System.out.println("reversed: " + rev);
      s.close();
   }
}
