/**
   * file: ex4_15.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 2 Part 2
   * due date: Feburary 28th, 2017
   * version: 1.0
   */
import java.util.Scanner; 
public class ex4_15 {
  public static void main (String[] args) {
    System.out.print("Enter a letter: ");
    Scanner input = new Scanner(System.in);
    String letter = input.nextLine();
    char character = letter.charAt(0);
    character = Character.toUpperCase(character);
    int num = 0;
    //The If statement figures out which number the entered letter will correspond to.
    if (Character.isLetter(character)) {
      if (character >= 'W') {
        num = 9;
      }
      else if (character >= 'T') {
        num = 8;
      }
      else if (character >= 'P') {
        num = 7;
      }
      else if (character >= 'M') {
        num = 6;
      }
      else if (character >= 'J') {
        num = 5;
      }
      else if (character >= 'G') {
        num = 4;
      }
      else if (character >= 'D') {
        num = 3;
      }
      else if (character >= 'A') {
        num = 2;
      }
      System.out.println("The corresponding number is " + num);
    }
    else {
    	System.out.println(character + " is an invalid input");
    }
  }
}