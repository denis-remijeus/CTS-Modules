class Vehicle {
   void start() {
      System.out.println("engine starting...");
   }
}

class Car extends Vehicle {
   void drive() {
      System.out.println("car moving...");
   }
}

public class VehicleInheritance {
   public static void main(String[] args) {
      Car c = new Car();
      c.start();
      c.drive();
   }
}
