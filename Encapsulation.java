/*
 This program demonstrates the concept of encapsulation in Java.
 Author: Sandra Nasimiyu Oyuga
Reg no: CT101/G/20455/23
date: 9th March 2025
 */
import java.util.Scanner;

// Class representing a bank account
class BankAccount {
  // Private field to store the balance
  private double balance;

  // Constructor to initialize the balance
  public BankAccount(double balance){
    this.balance = balance;
  }

  // Getter method to retrieve the balance
  public double getBalance(){
    return balance;
  }
  
  // Method to deposit an amount into the account
  public void setdeposit(double amount){
    if (amount > balance) {
      System.out.println("You have insufficient balance");
    }
    else{
      balance += amount;
    }
  }

  // Method to withdraw an amount from the account
  public void setWithdraw(double amount){
    balance -= amount;
  }
}

// Main class to test the BankAccount class
public class Encapsulation {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompt user to enter initial balance
    System.out.println("Enter balance");
    BankAccount account1 = new BankAccount(scanner.nextDouble()); 
    System.out.println("" + account1.getBalance());

    // Prompt user to enter amount to deposit
    System.out.println("Enter amount to deposit");
    account1.setdeposit(scanner.nextDouble());
    System.out.println(" Balance :" + account1.getBalance());

    // Prompt user to enter amount to withdraw
    System.out.println("Enter amount to withdraw");
    account1.setWithdraw(scanner.nextDouble());
    System.out.println(" Balance :" + account1.getBalance());

    // Close the scanner
    scanner.close();
  }
}