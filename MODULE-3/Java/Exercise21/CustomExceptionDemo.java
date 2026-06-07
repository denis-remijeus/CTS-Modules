import java.util.Scanner;

class InvalidAgeException extends Exception {
   public InvalidAgeException(String msg) {
      super(msg);
   }
}

public class CustomExceptionDemo {
   static void checkAge(int age) throws InvalidAgeException {
      if (age < 18) throw new InvalidAgeException("must be 18+");
   }

   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("age: ");
      if (!s.hasNextInt()) { System.out.println("int pls"); s.close(); return; }
      int age = s.nextInt();
      try {
         checkAge(age);
         System.out.println("eligible");
      } catch (InvalidAgeException e) {
         System.out.println("error: " + e.getMessage());
      }
      s.close();
   }
}
