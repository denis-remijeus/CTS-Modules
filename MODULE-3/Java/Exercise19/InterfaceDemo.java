interface Drivable {
   void drive();
}

class Car implements Drivable {
   @Override
   public void drive() {
      System.out.println("car is driving...");
   }
}

public class InterfaceDemo {
   public static void main(String[] x) {
      Car c = new Car();
      c.drive();
   }
}
