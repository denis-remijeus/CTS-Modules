import java.util.Scanner;

public class ArraySumAverage {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("how many elements: ");
      if (!s.hasNextInt()) { System.out.println("int req"); s.close(); return; }
      int sz = s.nextInt();
      if (sz <= 0) { System.out.println("need > 0"); s.close(); return; }
      int[] arr = new int[sz];
      System.out.println("enter " + sz + " nums:");
      for (int i = 0; i < sz; i++) {
         if (!s.hasNextInt()) { System.out.println("int only"); s.close(); return; }
         arr[i] = s.nextInt();
      }
      int sum = 0;
      for (int v : arr) sum += v;
      double avg = (double) sum / sz;
      System.out.println("sum = " + sum);
      System.out.println("avg = " + avg);
      s.close();
   }
}
