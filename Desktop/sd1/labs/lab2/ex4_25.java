/**
   * file: ex4_25.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 2 Part 2
   * due date: Feburary 28th, 2017
   * version: 1.0
   */
public class ex4_25 {
  public static void main (String[] args) {
    // The following variables generate a random number in the Char Alphabet Range
    int firstLetter = 65 + (int)(Math.random() * (90-65)); 
    char firstLetterC= (char)('A' + firstLetter);
    int secondLetter = 65 + (int)(Math.random() * (90-65));
    char secondLetterC= (char)('A' + secondLetter);
    int thirdLetter = 65 + (int)(Math.random() * (90-65));
    char thirdLetterC= (char)('A' + thirdLetter);
    int num1 = (int)(Math.random() * 10);
    int num2 = (int)(Math.random() * 10);
    int num3 = (int)(Math.random() * 10);
    int num4 = (int)(Math.random() * 10);
    System.out.println( firstLetterC + secondLetterC + thirdLetterC + num1 + 
      num2 + num3 + num4);
  }
}