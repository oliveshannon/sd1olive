/**
   * file: ex7_20.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 5
   * due date: March 30th, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class ex7_20 {
  public static void main(String[] args) {
    double [] numList = new double[10];
    System.out.print("Enter 10 numbers: ");
    Scanner input = new Scanner(System.in);
    for (int i=0; i< numList.length; i++)
      numList[i]= input.nextDouble();
    selectionSort(numList);
    for (double i: numList)
      System.out.print(i + " ");
    System.out.println();
  }
  public static void selectionSort(double[] sortedList){
    for (int i = sortedList.length - 1; i>= 0; i--) {
      double max = sortedList[i];
      int maxIndex = i;
      for (int j=i-1; j>= 0; j--) {
        if (max < sortedList[j]) {
          max= sortedList[j];
          maxIndex = j;
        }
      }
    }
  }
}