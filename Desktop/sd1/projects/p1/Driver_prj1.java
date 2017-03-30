/**
   * file: project1.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: project 1
   * due date: March 30th, 2017
   * version: 1.3
   */
import java.util.Scanner;
public class Driver_prj1 {
  public static void main(String[] args) {
    int vectorAsize =0;
    int vectorBsize=0;
    Scanner input= new Scanner(System.in);
    System.out.println("Enter the size of the first vector: ");
    vectorAsize= input.nextInt();
    System.out.println("Enter the size of the second vector: ");
    vectorBsize= input.nextInt();
    double[] vectorA= new double[vectorAsize];
    double[] vectorB= new double[vectorBsize];
    System.out.println("Enter the data for the first vector: ");
    for(int i=0; i < vectorAsize; i++){
      vectorA[i]= input.nextInt();
    } 
    System.out.println("Enter the data for the second vector: ");
    for(int i=0; i < vectorBsize; i++){
      vectorB[i]= input.nextInt();
    } 
    double[] finalData= convolute(vectorA, vectorB);
    for (int i=0; i< finalData.length; i++){
      finalData[i]= Math.round(finalData[i]);
    }
    for (double e: finalData){
      System.out.print(" " + e);
    }
  }
  public static double[] convolute(double[] vectorA, double[] vectorB){
    double[] finalData= new double[(vectorA.length + vectorB.length)-1];
    for (int index=0; index< finalData.length; index++){
      for (int shift=0; shift< vectorB.length; shift++){ // this is where Im 
      	int indxshift= index- shift;	// to catch out of bounds exceptions
        if (indxshift < 0 || indxshift > finalData.length){ // but it isnt
          indxshift=1;                               //doing its job
        }
        finalData[index]= vectorA[indxshift] * vectorB[index]; 
      }                        
    }
    return finalData[];
  }
}