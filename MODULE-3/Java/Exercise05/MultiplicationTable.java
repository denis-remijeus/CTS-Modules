import java.util.Scanner;

public class MultiplicationTable {
   public static void main(String args[]) {
      Scanner inp = new Scanner(System.in);
      System.out.print("enter a number: ");
      int num = inp.nextInt();
      System.out.println("--- table of " + num + " ---");
      for (int i = 1; i <= 10; i++) {
         System.out.println(num + " x " + i + " = " + (num * i));
      }
      inp.close();
   }
}
