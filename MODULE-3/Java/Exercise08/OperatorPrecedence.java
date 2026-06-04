public class OperatorPrecedence {
   public static void main(String[] args) {
      int a = 10 + 5 * 2;
      int b = (10 + 5) * 2;
      int c = 20 / 2 + 3;
      int d = 15 - 10 % 3;

      System.out.println("10 + 5 * 2 = " + a);
      System.out.println("(10 + 5) * 2 = " + b);
      System.out.println("20 / 2 + 3 = " + c);
      System.out.println("15 - 10 % 3 = " + d);
      System.out.println("* and / before + and -");
   }
}
