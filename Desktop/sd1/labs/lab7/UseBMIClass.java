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
    BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
    System.out.println("The BMI for " + bmi1.getName() + " is "
    + bmi1.getBMI() + " " + bmi1.getStatus());
    BMI bmi2 = new BMI("Susan King", 35, 215, 70);
    System.out.println("The BMI for " + bmi2.getName() + " is "
    + bmi2.getBMI() + " " + bmi2.getStatus());
    }
  }