/**
   * file: ex2_6.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 2
   * due date: Febuary 2nd, 2017
   * version: 1.0
   */
import java.util.Scanner;

public class ex2_6 {
  public static void main(String[] args) {
    System.out.print("Enter a number between 0 and 1000:");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int OnesPlace = number % 10; 
    int TensPlaceB = number % 100;
    // variable TensPlaceB is only to get the tens place value
    // so that it can be subtracted from the number to get
    // the value for HundredsPlace
    int TensPlace = (number - OnesPlace) % 100; 
    int HundredsPlace = (number - TensPlaceB) / 100;  
    int sum = HundredsPlace + TensPlace + OnesPlace;
    System.out.println("The sum of the digits is" + sum);
  }
}