/**
   * file: lab2task2.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 2
   * due date: Feburary 16th, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class lab2task2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the following as percentage, sans percent sign: " +
    "Midterm, Final, Project, and HW/Lab Grade");
    double midterm = input.nextDouble();
    double finalexam = input.nextDouble();
    double projects = input.nextDouble();
    double hwandlabs = input.nextDouble();
    double finalgrade = (midterm * 0.2) + (finalexam * 0.2) + (projects * 0.2) + 
    (hwandlabs * 0.4); 
    String letterGrade = " ";
    if (finalgrade > 94) {
      letterGrade = "A";
      System.out.println("Your final grade, " + finalgrade 
      + ", is an " + letterGrade);
  }
    else if (90<finalgrade && finalgrade<95) {
      letterGrade = "A-";
      System.out.println("Your final grade, " + finalgrade 
      + ", is an " + letterGrade);
    }
    else if (87<finalgrade && finalgrade<90) {
      letterGrade = "B+";
      System.out.println("Your final grade, " + finalgrade 
      + ", is an " + letterGrade);
    }
    else if (83<finalgrade && finalgrade<87) {
      letterGrade = "B";
      System.out.println("Your final grade, " + finalgrade 
      + ", is an " + letterGrade);
    }
    else if (80<finalgrade && finalgrade<83) {
      letterGrade = "B-";
      System.out.println("Your final grade, " + finalgrade 
      + ", is an " + letterGrade);
    }
    else if (77<finalgrade && finalgrade<80) {
      letterGrade = "C+";
      System.out.println("Your final grade, " + finalgrade 
      + ", is an " + letterGrade);
    }
    else if (73<finalgrade && finalgrade<77) {
      letterGrade = "C";
      System.out.println("Your final grade, " + finalgrade 
      + ", is an " + letterGrade);
    }
    else if (70<finalgrade && finalgrade<73) {
      letterGrade = "C-";
      System.out.println("Your final grade, " + finalgrade 
      + ", is an " + letterGrade);
    }
    else if (65<finalgrade && finalgrade<70) {
      letterGrade = "D+";
      System.out.println("Your final grade, " + finalgrade 
      + ", is an " + letterGrade);
    }
    else if (60<finalgrade && finalgrade<65) {
      letterGrade = "D";
      System.out.println("Your final grade, " + finalgrade 
      + ", is an " + letterGrade);
    }
    else if (finalgrade<60) {
      letterGrade = "F";
      System.out.println("Your final finalgrade is an" + finalgrade);
    }
  }
}