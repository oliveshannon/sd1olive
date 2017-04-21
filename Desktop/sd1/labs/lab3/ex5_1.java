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
    double total = 0;
    int numArray[]= new int[7];
    double count = numArray.length;
    Scanner input= new Scanner(System.in);
    System.out.print("Enter 7 integers, the input ends if it is 0: ");
    for (int i=0; i < numArray.length; i++){
      numArray[i] = input.nextInt();
    }
    for (int i= 0; i < numArray.length; i++){
      if (numArray[i] >0) {
        positiveNum++; 
      }
      else if (numArray[i] <0) {
        negativeNum++; 
      }
      else if ((total + numArray[i]) == 0) {
        System.out.println("No numbers are entered except 0");
      }
      total += numArray[i]; 
    }
    double avg = total / count;
    System.out.println(
      "The number of positive is " + positiveNum +
      "\nThe number of negatives is " + negativeNum +
      "\nThe total is total " + total +
      "\nThe average is " + avg);
  }
}