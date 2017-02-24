/**
   * file: ex4_8.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 2 Part 2
   * due date: Feburary 28th, 2017
   * version: 1.0
   */
import java.util.scanner;
public class ex4_8 {
  public static void main(String[] args) {
    System.out.print("Enter an ASCII code (a number between 0 and 127): ");
    Scanner input = new Scanner(System.in);
    int code = input.nextInt();
    //Converts the input into its ASCII code.
    System.out.print((char)code);
    }
}