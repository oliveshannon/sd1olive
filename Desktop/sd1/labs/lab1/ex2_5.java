/**
   * file: ex2_5.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 1
   * due date: Febuary 2nd, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class ex2_5 {
  public static void main(String[] args) {
    System.out.print("Enter the subtotal and the gratuity rate: ");
    Scanner input =  new Scanner(System.in);
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();
    double gratuity = subtotal * (gratuityRate/100);
    double total = subtotal+gratuity;
    System.out.println("The gratuity is $" + gratuity + " and the total is $"
      + total);
  }
}