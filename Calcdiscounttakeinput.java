//program to calculate discount based on the amount entered by the user
//Author: Sandra Nasimiyu Oyuga
//Reg no: CT101/G/20455/23
//date: 24th January 2025

import java.util.Scanner;

public class Calcdiscounttakeinput {
  //method to calculate discount
  public static String CalcDiscount(double amount) {
    double discount = 0;
    if(amount >= 1000 && amount <= 5000){
      discount = 0.05 * amount;
      return "Discount is : " + discount;
    }
    else if(amount > 5000){
     discount = 0.1 * amount;
     return "Discount is : " + discount;
    }
    else{
      return "No discount available!";
    }
   
    
  }
  //main method
  public static void main(String[] args) {
    //create a scanner object
    Scanner input = new Scanner(System.in);

    //prompt the user to enter the amount
    System.out.println("Enter the amount : ");
    double amount = input.nextDouble();
 
    //call the calc_discount method and print the result
    System.out.println(CalcDiscount(amount));
    input.close();
  }

}
