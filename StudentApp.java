 /*
  This program demonstrates how to create a simple class in Java.
  It defines a class StudentRecord with attributes studentID, name, and course.

  Author: Sandra Nasimiyu Oyuga
  Reg no: CT101/G/20455/23
  date: 14th February 2025
  */

 import java.util.Scanner;

// Class representing a student record
 class StudentRecord {
  // Attributes
  int studentID;
  String name;
  String course;
// Constructor to initialize student details
  public StudentRecord(int studentID, String name, String course) {
    this.studentID = studentID;
    this.name = name;
    this.course = course;
  }
// Method to display student details
  public void displayInfo() {
    System.out.println("Student ID: " + studentID);
    System.out.println("Name: " + name);
    System.out.println("Course: " + course);
  }
}
// Main class to interact with the user and display student details
public class StudentApp {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter student ID:");
    int studentID = input.nextInt();

    System.out.println("Enter student name:");
    String name = input.next();

    System.out.println("Enter course :");
    String course = input.next();

// Create a new student record
    StudentRecord student = new StudentRecord(studentID, name, course);

    // Display student details
    student.displayInfo();

    input.close();

    
  }
}
