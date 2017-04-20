/**
   * file: ex9_13.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 6, ex9_13
   * due date: April 20th, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class ex9_13 {
  public static void main(String[] args){
    System.out.println("Input the number of rows and columns in your array");
	Scanner input = new Scanner(System.in);
	int rows = input.nextInt();
	int columns = input.nextInt();
	double[][] array= new double [rows][columns];
	System.out.println("Enter the data for the array");
	for (int i=0; i < array.length; i++){
	  for (int j=0; j < array[i].length; j++) {
	    array[i][j]= input.nextDouble();
	  }
	}
	Location userArray= locateLargest(array);
	System.out.println("The largest element is " + userArray.maxValue + " located at " 
	+ "(" + userArray.row + ", " + userArray.column + ")");
  }
  public static Location locateLargest(double[][] a){
    return new Location(a);
  }
}