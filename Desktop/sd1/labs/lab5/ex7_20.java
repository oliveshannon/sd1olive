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
    for (int i=0; i< numList.length; i++){
      numList[i]= input.nextDouble();
  }
  selectionSort(numList);
    for (int i=0; i< numList.length; i++){
      System.out.print(numList[i] + " ");
    }
  }
  public static void selectionSort(double[] list){
    for (int i = list.length - 1; i>= 0; i--) {
      double max = list[i];
      int maxIndex = i;
      for (int j=i-1; j>= 0; j--) {
        if (max < list[j]) {
          max= list[j];
          maxIndex = j;
        }
      }
      if (maxIndex != i){
        list[maxIndex]= list[i];
        list[i]= max;
      }
    }
  }
}