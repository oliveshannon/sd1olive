/**
   * file: ex2_1.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 1
   * due date: Febuary 2nd, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class ex2_1 {
  public static void main(String[] args) {
    System.out.print("Enter a temp. in Celsius");
    Scanner input = new Scanner(System.in);
    double celsius = input.nextDouble();
    double fahrenheit = ((9 / 5)* celsius)+32;
    System.out.println(celsius + "Celsius is" + " " + fahrenheit);
  }
}