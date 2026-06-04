import java.util.Scanner;

public class LeapYearChecker {
   public static void main(String[] u) {
      Scanner sc = new Scanner(System.in);
      System.out.print("year: ");
      int y = sc.nextInt();
      boolean leap = false;
      if (y % 400 == 0) leap = true;
      else if (y % 100 == 0) leap = false;
      else if (y % 4 == 0) leap = true;
      System.out.println(y + (leap ? " is" : " is not") + " a leap year");
      sc.close();
   }
}
