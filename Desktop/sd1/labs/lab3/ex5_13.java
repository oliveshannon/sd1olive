/**
   * file: ex5_13.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 3
   * due date: Feburary 23th, 2017
   * version: 1.0
   */
public class ex5_13 {
  public static void main(String[] args) {
    int n = 0;
    while (Math.pow(n+1, 3) < 120000) {
      n++;
    }
    System.out.print("The largest integer that, cubed, "
    + "is less than 12000 is: " + n);
  }
}