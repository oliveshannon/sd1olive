/**
   * file: lab1task2.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 1
   * due date: Febuary 2nd, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class lab1task2 {
  public static void main(String[] args) {
    System.out.print("Please enter the following as percentage...");
    Scanner input = new Scanner(System.in);
    double midterm = input.nextDouble();
    double finalexam = input.nextDouble();
    double projects = input.nextDouble();
    double hwandlabs = input.nextDouble();
    double finalgrade = (midterm * 0.2) + (finalexam * 0.2) + (projects * 0.2) + 
    (hwandlabs * 0.4); 
    System.out.println("Your final grade is " + finalgrade);
  }
}