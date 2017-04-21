/**
   * file: ex4_1.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 2 Part 2
   * due date: Feburary 28th, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class ex4_1 {
  public static void main(String[] args) {
    System.out.print("Enter the length from the center to a vertex");
    Scanner input = new Scanner(System.in);
    double r = input.nextDouble();
    // Calculates the length of a side.
    double s = (2*r) * Math.sin(Math.PI/5); 
    // Calculates the area of pentagon.
    double pentagonarea = (5*Math.pow(s, 2)) / (4*Math.tan(Math.PI/5));
    System.out.print("The area of the pentagon is " + pentagonarea);
    }
}