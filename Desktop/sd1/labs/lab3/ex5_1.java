/**
   * file: ex5_1.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 3
   * due date: Feburary 23th, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class ex5_1 {
  public static void main(String[] args) {
    int positiveNum = 0; 	
    int negativeNum = 0; 	
    int i = 0;			
    double total = 0;
    Scanner input= new Scanner(System.in);
    do {
      System.out.print("Enter an integer, the input ends if it is 0: ");
      int num = input.nextInt();
      if (num >0) {
        positiveNum++;
      }
      else if (num<0) {
        negativeNum++;
      }
      else if ((total + num) == 0) {
        System.out.println("No numbers are entered except 0");
      }
      total += num;
      i++;
      num= input.nextInt();
    } while (num != 0);
    double avg = total/ count;
    System.out.println(
      "The number of positive is " + positiveNum +
      "\nThe number of negatives is " + negativeNum +
      "\nThe total is total " + total +
      "\nThe average is " + average);
  }
}