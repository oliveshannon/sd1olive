import java.util.Scanner;
public class ex3_11 {
  public static void main(String[] args) {
    System.out.print("Enter the month, as a number");
    Scanner input = new Scanner(System.in);
    int month = input.nextInt();
    System.out.print("Enter the year");
    int year = input.nextInt();
    switch (month) 
    {
     case 1: System.out.println("January had 31 days in " + year);
     case 2: System.out.println("February had 28 days " + year);
     case 3: System.out.println("March had 31 days in " + year);
     case 4: System.out.println("April had 30 days in " + year);
     case 5: System.out.println("May had 31 days in " + year);
     case 6: System.out.println("June had 31 days in " + year);
     case 7: System.out.println("July had 31 days in " + year);
     case 8: System.out.println("August had 31 days in " + year);
     case 9: System.out.println("September had 31 days in " + year);
     case 10: System.out.println("October had 31 days in " + year);
     case 11: System.out.println("November had 31 days in " + year);
     case 12: System.out.println("December had 31 days in " + year);
    }
  }
}