/**
   * file: ex8_13.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 5
   * due date: March 30th, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class ex8_13 {
  public static void main(String[] args){
    System.out.print("Enter the number of rows and columns of the array: ");
    Scanner input= new Scanner(System.in);
    int row= input.nextInt();
    int column= input.nextInt();
    double [][] multiArray= new double[row][column];
    System.out.println("Enter the array");
    for (int i=0; i< multiArray.length; i++) {
      for (int j=0; j< multiArray[i].length; j++) {
        multiArray[i][j]= input.nextDouble();
      }
    }
    int[] place= locateLargest(multiArray);
    System.out.println("The location of the largest element is at (" + place[0]
      + "," + place[1] + ")");
  }
  public static int[] locateLargest(double [][] inputArray){
    int[] location = new int[2];
    location[0]= 0;
    location[1]= 1;
    double largest = 0; 
    for (int i=0; i< inputArray.length; i++) {
      for (int j=0; j< inputArray[i].length; j++) {
        if (inputArray[i][j] > largest) {
          location[0]=i;
          location[1]=j;
          largest= inputArray[i][j];
        }
      }
    }
    return location;
  }
}