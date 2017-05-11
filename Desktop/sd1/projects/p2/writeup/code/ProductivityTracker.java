/**
   * file: ProductivityTracker.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: project 2
   * due date: May 10th, 2017
   * version: 4.0
   * this class invokes the constructor class DateObject.java
   *------------------------------------
   *| Class Name: ProductivityTracker   |
   *------------------------------------
   *| newEntry: object DateObject       |
   *| input: object Scanner             |
   *-------------------------------------------------|
   *| getNewEntry(object): returns object newEntry   |
   *| getWeeklyProductivity(object): returns double  | 
   *| getProductivityChange(object): returns double  |
   *--------------------------------------------------
   */
import java.util.Scanner;

public class ProductivityTracker {
  // this method is a constructor for DateObject
  public static DateObject getNewEntry(Scanner input){
    // the variables have a C to identify them as constructors for the date object
    System.out.print("Enter the month and day seperately, like 3 23: ");
    int dayC = input.nextInt();
    int monthC = input.nextInt();
    System.out.print("Input how many tasks you had to complete today " 
      + " and how many you completed: ");
    int totalTasksC = input.nextInt(); 
    int tasksDoneC = input.nextInt(); 
    double productivityC = ((tasksDoneC * 100.0) / totalTasksC);  
    DateObject newEntry = new DateObject(dayC, monthC, totalTasksC, tasksDoneC, productivityC);
    return newEntry;
  }
  // method returns the weekly productivity
  public static double getWeeklyProductivity(Scanner input){
    System.out.print("Enter how many tasks you had to complete in total " +
      "this week, and how many you actually completed: ");
    int totalTasksW = input.nextInt();
    int tasksDoneW = input.nextInt();
    double productivityW = ((tasksDoneW * 100.0) / totalTasksW);
    return productivityW;
  }
  // method returns the Productivity Change
  public static double getProductivityChange(Scanner input){
    System.out.println("Enter how many tasks you had to complete " +
      "and how many you actually completed on the first day this week: ");
    int totalTasks1 = input.nextInt();
    int tasksDone1= input.nextInt();
    double productivity1 = ((tasksDone1 * 100.0) / totalTasks1);
    System.out.println("Enter how many tasks you had to complete " +
      "and how many you actually completed on the last day this week: ");
    int totalTasks2 = input.nextInt();
    int tasksDone2 = input.nextInt();
    double productivity2 = ((tasksDone2 * 100.0) / totalTasks2);
    double productivityChange = (((productivity2-productivity1)/productivity1)
      *100.0);
    return productivityChange;
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    DateObject newEntry = getNewEntry(input);  
    double todaysProductivity = newEntry.productivity;  
    // the program calculates your producitivity for the day 
    System.out.println("Your producitivity today was " + todaysProductivity +
      "%");  
    System.out.print("If you'd like to calculate your weekly productivity, " +
      "enter 1. If you'd like to see how much your productivity has changed" +
      " over the past week, press 2: "); 
    int option = input.nextInt();
    // user can choose which option they want
    if (option == 1){
      double weeklyProductivity = getWeeklyProductivity(input);
      System.out.println("Your weekly productivity is " + weeklyProductivity +
        "%");
    }
    else if (option == 2){
      double productivityChange = getProductivityChange(input);
      if (productivityChange<1.0){
      System.out.println("You've gotten " + (productivityChange*(-1)) +
        "% less productive over the course of the week!");
      }
      else if (productivityChange>1.0){
      System.out.println("You've gotten " + productivityChange +
        "% more productive over the course of the week!");
      }
      else {
      System.out.println("Your productivity didn't change this week!");
      }
    }
  }   
}



    

