import java.util.Scanner;

public class FactorialCalculator {
   public static void main(String[] z) {
      Scanner sc = new Scanner(System.in);
      System.out.print("n: ");
      if (!sc.hasNextInt()) { System.out.println("need int"); sc.close(); return; }
      int n = sc.nextInt();
      if (n < 0) { System.out.println("no negative"); sc.close(); return; }
      long fact = 1;
      for (int i = 2; i <= n; i++) fact *= i;
      System.out.println(n + "! = " + fact);
      sc.close();
   }
}
