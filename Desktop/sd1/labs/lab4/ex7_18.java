/**
   * file: ex7_18.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 4
   * due date: Febuary 9th, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class ex7_18 {
public static void main(String[] args){
  double[] numArray = new double[10];
  System.out.print("Enter 10 numbers: ");
  Scanner input = new Scanner(System.in);
  for (int i=0; i<numArray.length; i++) {
    numArray[i] = input.nextDouble();
  }
  bubbleSort(numArray);
  for (double e: numArray) {
    System.out.print(e + " ");
  }
  System.out.println();
}

public static void bubbleSort(double[] list){
  double placeHolder;
  boolean swapped;
  do {
    swapped= false;
    for (int i=0; i< list.length - 1; i++) {
      if (list[i] > list[i+1]){
        placeHolder= list[i];
        list[i] = list[i+1];
        list[i+1]= placeHolder;
        swapped = true;
        }
      }
    }
    while (swapped);
  }
}