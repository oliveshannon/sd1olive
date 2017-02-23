/**
   * file: ex5_12.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 3
   * due date: Feburary 23th, 2017
   * version: 1.0
   */
public class ex5_12 {
  public static void main(String[] args) {
    int n= 0;
    while (Math.pow(n,2) <= 12000) {
      n++;
    }
    System.out.print("The smallest integer n such that 
      n squared is greater than 12,000 is: " + n);
  }
}