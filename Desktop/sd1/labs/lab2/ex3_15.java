/**
   * file: ex3_15.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 2
   * due date: Feburary 16th, 2017
   * version: 1.0
   */
import java.util.Scanner;
public static void main(String[] args) {
  int lottonum = (int)(Math.random()*1000);
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a 3 digit number");
  int guess = input.nextInt();
  int lottodigit1 = lottonum / 100;
  int otherdigits = lottonum % 100;
  int lottodigit2 = otherdigits / 10;
  int lottodigit3 = otherdigits % 10;
  int guess1 = guess / 100;
  int otherdigits = guess % 100;
  int guess2 = otherdigits / 10;
  int guess3 = otherdigits % 10;
  System.out.println("The lotto number is " + lottonum);
  if (guess == lottonum) {
    System.out.println("Congrats! You win $10,000");
  }
  // I could find no viable way to complete the rest of this program, 
  // despite some intensive googling and thinking, so i have left it
  // blank
  else if ()
}