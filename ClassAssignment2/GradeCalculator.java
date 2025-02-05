// The GradeCalculator class provides a method to calculate the grade 
//based on the given marks.

//Author: Sandra Nasimiyu Oyuga
//Reg no: CT101/G/20455/23
//date: 2nd February 2025

package ClassAssignment2;

//class to calculate grades
public class GradeCalculator {
  // Method to calculate the grade based on the given marks
  public String calculateGrade(double marks) {
    String grade;

    // Check the range of marks and assign the corresponding grade
    if (marks >= 90 && marks <= 100) {
      grade = "A";
    } else if (marks >= 75 && marks < 90) {
      grade = "B";
    } else if (marks >= 50 && marks < 75) {
      grade = "C";
    } else if (marks < 50) {
      grade = "D";
    } else {
      grade = "Invalid";
    }

    return grade;
  }
}
