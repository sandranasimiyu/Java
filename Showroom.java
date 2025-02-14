/*
  This program demonstrates the use of inheritance in Java.
  It defines a base class Vehicle and a derived class Car.

  Author: Sandra Nasimiyu Oyuga
  Reg no: CT101/G/20455/23
  date: 14th February 2025
  
 */

import java.util.Scanner;

// Base class representing a vehicle
class Vehicle {
  String brand;
  String model;
  int year;

  // Constructor to initialize vehicle details
  public Vehicle(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  // Method to display vehicle details
  public void displayDetails() {
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
  }
}

// Derived class representing a car, which is a type of vehicle
class Car extends Vehicle {
  String fuelType;

  // Constructor to initialize car details, including fuel type
  public Car(String brand, String model, int year, String fuelType) {
    super(brand, model, year);
    this.fuelType = fuelType;
  }

  // Overridden method to display car details, including fuel type
  @Override
  public void displayDetails() {
    super.displayDetails();
    System.out.println("Fuel Type: " + fuelType);
  }
}

// Main class to interact with the user and display car details
public class Showroom {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt user for vehicle details
    System.out.print("Enter brand: ");
    String brand = input.nextLine();

    System.out.print("Enter model: ");
    String model = input.nextLine();

    System.out.print("Enter year: ");
    int year = input.nextInt();

    input.nextLine(); // Consume newline character

    System.out.print("Enter fuel type: ");
    String fuelType = input.nextLine();

    // Create a Car object with the provided details
    Car car = new Car(brand, model, year, fuelType);
    
    // Display the car details
    car.displayDetails();

    input.close(); // Close the scanner
  }
}
