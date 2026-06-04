import java.util.Scanner;

public class EvenOddChecker {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("give me a number: ");
      int n = s.nextInt();
      String msg = (n % 2 == 0) ? "even" : "odd";
      System.out.println(n + " is " + msg);
      s.close();
   }
}
