/**
   * file: UseBMI.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 7, ex10_2
   * due date: April 20th, 2017
   * version: 1.0
   */
public class UseBMIClass{
  public static void main(String[] args) {
    BMI bmiOne = new BMI("Jane Doe", 17, 120, 5, 4);
	System.out.println("The BMI for " + bmiOne.getName() + " is "
	+ bmiOne.getBMI() + " " + bmiOne.getStatus());
	BMI bmiTwo = new BMI("John Doe", 22, 164, 6, 1);
	System.out.println("The BMI for " + bmiTwo.getName() + " is "
	+ bmiTwo.getBMI() + " " + bmiTwo.getStatus());
  }
}