import java.util.Scanner;

public class Quickstart {
  public static DateObject getNewEntry(Scanner input){
    // the variables have a C to identify them as constructors for the date object
    System.out.print("Enter the day and month seperately, like 3 23: ");
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
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    DateObject newEntry = getNewEntry(input); 
    input.close();           
  }   
}



    

