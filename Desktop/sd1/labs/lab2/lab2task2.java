import java.util.Scanner;
public class lab2task2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the following as percentage...");
    double midterm = input.nextDouble();
    double finalexam = input.nextDouble();
    double projects = input.nextDouble();
    double hwandlabs = input.nextDouble();
    int finalgrade = (midterm * 0.2) + (finalexam * 0.2) + (projects * 0.2) + 
    (hwandlabs * 0.4); 
    if (finalgrade > 94) {
      grade = "A";
      System.out.println("Your final grade is an" + grade);
  }
    else if (90<finalgrade<95) {
      grade = "A-";
      System.out.println("Your final grade is an" + grade);
    }
    else if (87<finalgrade<90) {
      grade = "B+";
      System.out.println("Your final grade is an" + grade);
    }
    else if (83<finalgrade<87) {
      grade = "B";
      System.out.println("Your final grade is an" + grade);
    }
    else if (80<finalgrade<83) {
      grade = "B-";
      System.out.println("Your final grade is an" + grade);
    }
    else if (77<finalgrade<80) {
      grade = "C+";
      System.out.println("Your final grade is an" + grade);
    }
    else if (73<finalgrade<77) {
      grade = "C";
      System.out.println("Your final grade is an" + grade);
    }
    else if (70<finalgrade<73) {
      grade = "C-";
      System.out.println("Your final grade is an" + grade);
    }
    else if (65<finalgrade<70) {
      grade = "D+";
      System.out.println("Your final grade is an" + grade);
    }
    else if (60<finalgrade<65) {
      grade = "D";
      System.out.println("Your final grade is an" + grade);
    }
    else if (finalgrade<60) {
      grade = "F";
      System.out.println("Your final grade is an" + grade);
    }
  }
}