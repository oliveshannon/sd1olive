/**
   * file: ex4_5.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 2 Part 2
   * due date: Feburary 28th, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class ex4_5 {
  public static void main(String[] args) {
    System.out.print("Enter the # of sides:");
    Scanner input = new Scanner(System.in);
    int numofsides = input.nextInt();
    System.out.print("Enter the side:");
    double side = input.nextDouble();
    // Calculates the Area
    double area = (numofsides*Math.pow(side, 2) / (4*Math.tan(Math.PI 
    / numofsides)));
    System.out.println("The area of the polygon is " + area); 
  }
}