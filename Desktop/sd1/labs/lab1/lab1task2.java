import java.util.Scanner;
public class lab1task2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the following as percentage...");
    double midterm = input.nextDouble();
    double finalexam = input.nextDouble();
    double projects = input.nextDouble();
    double hwandlabs = input.nextDouble();
    double finalgrade = (midterm * 0.2) + (finalexam * 0.2) + (projects * 0.2) + 
    (hwandlabs * 0.4); 
    System.out.println("Your final grade is " + finalgrade);
  }
}