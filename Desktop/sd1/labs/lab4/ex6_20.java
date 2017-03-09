/**
   * file: ex6_20.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 4
   * due date: Febuary 9th, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class ex6_20 {
  public static void main (String[] args){
    System.out.print("Enter a string:");
    Scanner input = new Scanner(System.in);
    String userInput = input.nextLine();
    System.out.println(
      "The number of letters in the string is: " + countLetters(userInput));
  }
  public static int countLetters(String userInput){
    int numOfLetters = 0;
    for (int i=0; i< userInput.length(); i++) {
      if (Character.isLetter(userInput.charAt(i))){
        numOfLetters++;
      }
    }
      return numOfLetters;
  }
}