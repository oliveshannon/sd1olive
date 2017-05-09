/**
   * file: ex7_32.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 5
   * due date: March 30th, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class ex7_32 {
  public static void main(String[] args){
    System.out.print("Enter a list of size 10: ");
    Scanner input= new Scanner(System.in);
    int[] list= new int[10];
    for (int i=0; i< list.length; i++) {
      list[i] = input.nextInt();
    }
    partition(list);
    for (int e: list) {
      System.out.print(" " + e);
    }
    System.out.println();
  }
  public static void partition(int[] list) {
    int minIndex=0; 
    int maxIndex= list.length - 1;
    int i= minIndex;
    int j= maxIndex;
    int pivot = list[minIndex+(maxIndex-minIndex)/2]; 
    while (i <= j) {
      while (list[i] < pivot){
        i++;
        }
      while (list[j] > pivot){
        j--;
        }
      if (i <= j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
        i++;
        j--;
          }
        }
  }
}