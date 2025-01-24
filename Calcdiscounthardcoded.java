// program to Calculate discount based on amount spent
//Author: Sandra Nasimiyu Oyuga
//Reg no: CT101/G/20455/23
//date: 24th January 2025

//main class
public class Calcdiscounthardcoded {
    //method to calculate discount
    public static String calc_discount(double amount) {
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
          return "No discount available";
        }
        
      }
      //main method
      public static void main(String[] args) {
        //call the calc_discount method and print the result
      System.out.println(calc_discount(4000));
    }
  }