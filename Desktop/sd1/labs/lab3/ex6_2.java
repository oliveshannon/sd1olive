/**
   * file: ex6_2.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 3
   * due date: Feburary 23th, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class ex6_2 {
  // This method is the main part of the program
  public static void main(String [] args) {
    System.out.print("Enter a number: ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    System.out.print("The sum of the digits of " + number + " is "
      + sumDigits(number));
  }
  // This method is called in the main method to compute the sum
  public static int sumDigits (long n) {
    int sum= 0;
    while (n>0) {
      sum+= n%10;
      n= n/10;
    }
    return sum;
  }
}