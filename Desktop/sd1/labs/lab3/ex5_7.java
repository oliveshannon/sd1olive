/**
   * file: ex5_7.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 3
   * due date: Feburary 23th, 2017
   * version: 1.0
   */
public class ex5_7 {
  public static void main(String[] args) {
    double tuition= 10000;
    int total= 0;
    int 4YrTotal;
    for (int year = 1; year <= 14; year++) {
      tuition = tuition * 1.05;
      if (year>10) {
        4YrTotal += tuition;
      }
      if (year== 10) {
        total = tuition; 
      }
    }
    System.out.println("Tuition in ten years: $" + total);
    System.out.println("The total cost for four years of tuition 
      after the tenth year is: $" + 4YrTotal); 
  }
}