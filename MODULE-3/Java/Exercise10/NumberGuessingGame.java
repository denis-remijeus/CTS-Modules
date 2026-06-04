import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rng = new Random();
      int target = rng.nextInt(100) + 1;
      int guess = 0;
      int tries = 0;
      while (guess != target) {
         System.out.print("guess (1-100): ");
         if (!sc.hasNextInt()) {
            System.out.println("that's not a number");
            sc.next(); continue;
         }
         guess = sc.nextInt();
         tries++;
         if (guess < target) System.out.println("too low");
         else if (guess > target) System.out.println("too high");
         else System.out.println("correct! took " + tries + " tries");
      }
      sc.close();
   }
}
