// This is a simple Java program to define an Employee class with attributes name and salary, 
// and a method to display the details of the employee.
//Author: Sandra Nasimiyu Oyuga
//Reg no: CT101/G/20455/23
//date: 2nd February 2025


package ClassAssignment1;

//Attributes
public class Employee{
  String name;
  double salary;

  // Constructor to initialize the Employee object with name and salary
  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  // Method to display the details of the employee
  public void displayDetails() {
    System.out.println("Employee Name: " + name);
    System.out.println("Salary: " + salary);
  }
}


