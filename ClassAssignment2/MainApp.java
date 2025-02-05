//This  program takes a student's name and marks then calculate the student's grade based on the marks, and then display the student's details.

//Author: Sandra Nasimiyu Oyuga
//Reg no: CT101/G/20455/23
//date: 2nd February 2025
package ClassAssignment2;
import java.util.Scanner;

public class MainApp {
  public static void main(String[] args) {
    // Create a Scanner object to read input from the console
    Scanner scanner = new Scanner(System.in);
    
    // Prompt the user to enter their name
    System.out.println("Enter name: ");
    String name = scanner.nextLine();

    // Prompt the user to enter their marks
    System.out.println("Enter marks");
    double marks = scanner.nextDouble();

    // Create a Student object with the entered name and marks
    Student student = new Student(name, marks);
    
    // Create a GradeCalculator object to calculate the grade
    GradeCalculator calculator = new GradeCalculator();

    // Calculate the grade based on the student's marks
    String grade = calculator.calculateGrade(student.marks);

    // Display the student's details
    student.displayDetails();
    
    // Display the calculated grade
    System.out.println("Your grade is: " + grade);

    // Close the scanner to free up resources
    scanner.close();
  }
}
  
