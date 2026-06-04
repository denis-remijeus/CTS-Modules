public class TypeCastingExample {
   public static void main(String args[]) {
      double d = 45.78;
      int i = (int) d;
      System.out.println("double: " + d);
      System.out.println("to int: " + i);

      int x = 100;
      double y = x;
      System.out.println("int: " + x);
      System.out.println("to double: " + y);
   }
}
