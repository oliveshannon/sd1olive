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
    double total= 0; 
    double fourYrTotal= 0; 
    for (int year = 1; year <= 14; year++) {
      tuition = tuition * 1.05; 
      if (year>10) {  
        fourYrTotal += tuition;
      }
      if (year== 10) {
        total = tuition; 
      }
    }
    int totalRounded = (int) Math.round(total);
    int fourYrTotalRounded = (int) Math.round(fourYrTotal);
    System.out.println("Tuition in ten years: $" + totalRounded);
    System.out.println("The total cost for four years of tuition" + 
      " after the tenth year is: $" + fourYrTotalRounded); 
  }
}