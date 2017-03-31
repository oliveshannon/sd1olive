/**
   * file: project1.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: project 1
   * due date: March 30th, 2017
   * version: 4
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
      System.out.print(Math.round(finalData[i]));
    }
  }
  public static double[] convolute(double[] vectorA, double[] vectorB){
    double[] finalData= new double[(vectorA.length + vectorB.length)-1];
    for (int index=0; index< finalData.length; index++){
      for (int shift=0; shift< vectorB.length; shift++){ 
        if (((index-shift)>=0) &&  ((index-shift)< vectorA.length));
        finalData[index] += vectorA[index-shift] * vectorB[shift]; 
      }                        
    }
    return finalData;
  }
}