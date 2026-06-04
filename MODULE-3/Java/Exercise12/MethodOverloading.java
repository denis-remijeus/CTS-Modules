public class MethodOverloading {
   static int add(int a, int b) {
      return a + b;
   }
   static double add(double a, double b) {
      return a + b;
   }
   static int add(int a, int b, int c) {
      return a + b + c;
   }
   public static void main(String[] x) {
      System.out.println("int+int: " + add(10, 20));
      System.out.println("dbl+dbl: " + add(12.3, 13.2));
      System.out.println("int+int+int: " + add(10, 20, 30));
   }
}
