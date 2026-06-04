import java.util.Scanner;

public class RecursiveFibonacci {
   static int fib(int n) {
      if (n <= 0) return 0;
      if (n == 1 || n == 2) return 1;
      return fib(n - 1) + fib(n - 2);
   }
   public static void main(String[] a) {
      Scanner s = new Scanner(System.in);
      System.out.print("n: ");
      if (!s.hasNextInt()) { System.out.println("int pls"); s.close(); return; }
      int n = s.nextInt();
      if (n <= 0) { System.out.println("positive only"); }
      else { System.out.println("fib(" + n + ") = " + fib(n)); }
      s.close();
   }
}
