/**
   * file: ex4_26.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 2 Part 2
   * due date: Feburary 23th, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class ex4_26 {
  public static void main(String[] args) {
    System.out.print("Enter a dollar amount without a dollar sign, 
      for example 11.56: "); 
    Scanner input = new Scanner(System.in);
    String dollarAmount = input.nextLine();
    int numOfDollars = Integer.parseInt(dollarAmount.substring(0, 
      (dollarAmount.indexOf('.') - 1)));
    int numOfCents = 
      Integer.parseInt(dollarAmount.substring((dollarAmount.indexOf('.') +1), 
      (dollarAmount.length() - 1))); 
    System.out.println("Your amount "+ dollarAmount + " consists of/n" + 
      numOfDollars + " dollars" + " and " + numOfCents + " cents.");
  }
}