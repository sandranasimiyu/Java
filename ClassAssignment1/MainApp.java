
// This program calculates the bonus for an employee based on their salary.
//Author: Sandra Nasimiyu Oyuga
//Reg no: CT101/G/20455/23
//date: 2nd February 2025

package ClassAssignment1;

import java.util.Scanner;

public class MainApp {
 
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompt user to enter employee name
    System.out.print("Enter Employee Name: ");
    String name = scanner.nextLine();

    // Prompt user to enter employee salary
    System.out.print("Enter Employee Salary: ");
    double salary = scanner.nextDouble();

    // Create an Employee object with the provided name and salary
    Employee employee = new Employee(name, salary);

    // Create a SalaryCalculator object
    SalaryCalculator calculator = new SalaryCalculator();

    // Calculate the bonus for the employee
    double bonus = calculator.calculateBonus(employee.salary);

    // Display employee details
    employee.displayDetails();

    // Display the calculated bonus
    System.out.println("Your bonus is: " + bonus);

    // Close the scanner
    scanner.close();
  }

}
