public class Car {
   String make;
   String model;
   int year;

   void show() {
      System.out.println("Car: " + make + " " + model + " (" + year + ")");
   }

   public static void main(String[] a) {
      Car c = new Car();
      c.make = "Toyota";
      c.model = "Camry";
      c.year = 2024;
      c.show();
   }
}
