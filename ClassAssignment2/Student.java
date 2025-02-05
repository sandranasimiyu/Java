// This is a simple Java program to define a Student class with attributes name and marks, 
// and a method to display the details of the student

//Author: Sandra Nasimiyu Oyuga
//Reg no: CT101/G/20455/23
//date: 2nd February 2025
package ClassAssignment2;

public class Student {
  // Attributes
  String name;
  double marks;

  // Constructor to initialize the student's name and marks
  public Student(String name, double marks){
    this.name = name;
    this.marks = marks;
  }

  // Method to display the student's details
  public void displayDetails(){
    System.out.println("Student name: " + name);
    System.out.println("Student marks: " + marks);
  }
  
}
