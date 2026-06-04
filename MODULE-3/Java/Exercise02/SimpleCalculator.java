import java.util.Scanner;

public class SimpleCalculator {
   public static void main(String[] a) {
      Scanner in = new Scanner(System.in);
      System.out.println("=== BASIC CALC ===");
      System.out.print("num1: ");
      double x = in.nextDouble();
      System.out.print("num2: ");
      double y = in.nextDouble();
      System.out.println("1-add 2-sub 3-mul 4-div");
      System.out.print("pick: ");
      int op = in.nextInt();
      double r = 0;
      boolean ok = true;
      switch (op) {
         case 1: r = x + y; break;
         case 2: r = x - y; break;
         case 3: r = x * y; break;
         case 4:
            if (y != 0) { r = x / y; }
            else { System.out.println("err: div by zero"); ok = false; }
            break;
         default: System.out.println("invalid option"); ok = false;
      }
      if (ok) System.out.println("result = " + r);
      in.close();
   }
}
