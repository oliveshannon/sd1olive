/**
   * file: ex7_9.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 4
   * due date: Febuary 9th, 2017
   * version: 1.0
   */
import java.util.Scanner;
  public class ex7_9 {
  public static void main(String[] args){
    double[] numArray= new double[10];
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 10 numbers: ");
    for (int i=0; i< numArray.length; i++) {
      numArray[i] = input.nextDouble();
    }
    System.out.println("The minimum number is: " + min(numArray));
  }
  public static double min(double[] array){
    double min= array[0];
    for (double i: array){
      if (i<min){
        min=i;
      }
    }
    return min;
  }
}