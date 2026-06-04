import java.util.Scanner;

public class PalindromeChecker {
   public static void main(String[] z) {
      Scanner s = new Scanner(System.in);
      System.out.print("word: ");
      String raw = s.nextLine();
      String clean = raw.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      String rev = new StringBuilder(clean).reverse().toString();
      if (!clean.isEmpty() && clean.equals(rev))
         System.out.println("\"" + raw + "\" is a palindrome");
      else
         System.out.println("\"" + raw + "\" is not a palindrome");
      s.close();
   }
}
