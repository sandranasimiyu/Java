/*
This is a program that demonstrates the use of abstract classes and methods in Java.
  Author: Sandra Nasimiyu Oyuga
  Reg no: CT101/G/20455/23
  date: 13th February 2025
 */

//class definition
 abstract class BankAccount {
  //attributes
  protected double balance;
  //constructor to initialize the BankAccount object with balance
 public BankAccount(double balance) {
    this.balance = balance;
  }
   // Method to deposit money into the account
   public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
        
    } else {
        System.out.println("Invalid deposit amount. Please deposit a positive value.");
    }
}

// Abstract method for withdrawal
public abstract void withdraw(double amount);

// Method to get the current balance
public double getBalance() {
    return balance;
}
}
 class SavingsAccount extends BankAccount {
    //constructor to initialize the SavingsAccount object with balance
  public SavingsAccount(double balance) {
    super(balance);
  }
//method to withdraw money from the account
  @Override
  public void withdraw(double amount) {
    //check if the balance is greater than the amount to be withdrawn
    if (balance - amount >= 100) {
      balance -= amount;
    } else {
      System.out.println("Insufficient funds to withdraw minimum balance is 100");
    }
  }
}
//class definition
class CheckingAccount extends BankAccount {
    //constructor to initialize the CheckingAccount object with balance
  public CheckingAccount(double balance) {
    super(balance);
  }
//method to withdraw money from the account
  @Override
  public void withdraw(double amount) {
    if (balance - amount - 1 >= 0) {
      balance -= amount + 1;
    } else {
      System.out.println("Insufficient funds to withdraw");
    }
  }
}
public class Bank {
//method to get the balance of the account
  public static void main(String[] args) {
    //create objects of the SavingsAccount and CheckingAccount classes
    SavingsAccount savingsaccount = new SavingsAccount(500);
    CheckingAccount checkaccount = new CheckingAccount(200);

    //deposit and withdraw money from the accounts
    savingsaccount.deposit(100);
    savingsaccount.withdraw(50);

    //display the balance of the accounts
    checkaccount.deposit(100);
    checkaccount.withdraw(50);

    //display the balance of the accounts
    System.out.println("Checking Account Balance: " + checkaccount.getBalance());
    System.out.println("Savings Account Balance: " + savingsaccount.getBalance());
  }
}
