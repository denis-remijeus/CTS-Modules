import java.util.Scanner;

public class TryCatchDemo {
   public static void main(String[] z) {
      Scanner s = new Scanner(System.in);
      System.out.print("a: ");
      if (!s.hasNextInt()) { System.out.println("need int"); s.close(); return; }
      int a = s.nextInt();
      System.out.print("b: ");
      if (!s.hasNextInt()) { System.out.println("need int"); s.close(); return; }
      int b = s.nextInt();
      try {
         int r = a / b;
         System.out.println("result: " + r);
      } catch (ArithmeticException e) {
         System.out.println("can't divide by zero");
      }
      s.close();
   }
}
