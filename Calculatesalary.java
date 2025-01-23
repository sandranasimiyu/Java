//program to calculate net bonus
//Author: Sandra Nasimiyu Oyuga
//Reg no: CT101/G/20455/23
//date: 23rd January 2025

// import the Scanner class
import java.util.Scanner;

// class definition
public class Calculatesalary {
  // main method
  public static void main(String[] args) {
    // create a Scanner object
    Scanner scanner = new Scanner(System.in);
// declare and initialize variables
    System.out.println("Enter the salary: ");
    int salary = scanner.nextInt();

    // prompt the user to enter the time period of service
    System.out.println("Enter the time period of service: ");
    int time_period_of_service = scanner.nextInt();

    int net_bonus;

    // calculate the net bonus
    if (time_period_of_service > 10) {
      net_bonus = (salary * 12 / 100) + salary;
    }
    else if (time_period_of_service >= 6 && time_period_of_service <= 10) {
      net_bonus = (salary * 10 / 100) + salary;
    }
    else {
      net_bonus = (salary * 8 / 100) + salary;
    }
    // display the net bonus
    System.out.println(" Your salary is" + salary  + " and your period of service is " + time_period_of_service + "your net bonus is: " + net_bonus);

    scanner.close();
  }
}
