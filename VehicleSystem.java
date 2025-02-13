/*
This is a program that demonstrates the use of abstract classes and methods in Java.
  Author: Sandra Nasimiyu Oyuga
  Reg no: CT101/G/20455/23
  date: 13th February 2025
 */
// Base class Vehicle
abstract class Vehicle {
  protected String brand;
  protected int speed;

  // Constructor
  public Vehicle(String brand, int speed) {
      this.brand = brand;
      this.speed = speed;
  }

  // Method to accelerate
  public void accelerate(int increase) {
      speed += increase;
  }

  // Method to brake
  public void brake(int decrease) {
      speed = Math.max(0, speed - decrease); // Ensures speed doesn't go below 0
  }

  // Abstract method to display details
  public abstract void showDetails();
}

// Subclass Car
class Car extends Vehicle {
  private int fuelLevel;

  // Constructor
  public Car(String brand, int speed, int fuelLevel) {
      super(brand, speed);
      this.fuelLevel = fuelLevel;
  }

  // Method to refuel
  public void refuel(int amount) {
      fuelLevel = Math.min(100, fuelLevel + amount); // Max fuel level is 100
  }

  // Override showDetails method
  @Override
  public void showDetails() {
      System.out.println("Car - Brand: " + brand + ", Speed: " + speed + " km/h, Fuel Level: " + fuelLevel + "%");
  }
}

// Subclass Bike
class Bike extends Vehicle {
  private boolean helmetOn;

  // Constructor
  public Bike(String brand, int speed, boolean helmetOn) {
      super(brand, speed);
      this.helmetOn = helmetOn;
  }

  // Method to wear a helmet
  public void wearHelmet() {
      helmetOn = true;
  }

  // Override showDetails method
  @Override
  public void showDetails() {
      System.out.println("Bike - Brand: " + brand + ", Speed: " + speed + " km/h, Helmet On: " + helmetOn);
  }
}

// Main class
public class VehicleSystem {
  public static void main(String[] args) {
      // Instantiate a Car object
      Car car = new Car("Toyota", 60, 50);
      car.accelerate(20);
      car.brake(30);
      car.refuel(30);
      car.showDetails();

      // Instantiate a Bike object
      Bike bike = new Bike("Yamaha", 40, false);
      bike.accelerate(15);
      bike.brake(10);
      bike.wearHelmet();
      bike.showDetails();
  }
}

