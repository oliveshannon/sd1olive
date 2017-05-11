/**
   * file: DateObject.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: project 2
   * due date: May 10th, 2017
   * version: 4.0
   * this class constructs a date object for the main program, 
   * ProductivityTracker.java
   *------------------------------------
   *| Class Name: DateObject           |
   *------------------------------------
   *| day: int
   *| month: int
   *| totalTasks: int
   *| tasksDone: int
   *| productivity: double
   *| entryIndex: int   
   *| input: object Scanner             
   *-------------------------------------------------|
   *| DateObject(int, int, int, double): returns instance of DateObject   |
   *--------------------------------------------------
   */
public class DateObject {
  public int day;
  public int month;
  public int totalTasks;
  public int tasksDone;
  public double productivity;
  public static int entryIndex = 0;
  public int entryNum;
  public DateObject(int dayC, int monthC,  int totalTasksC, int tasksDoneC,
   double productivityC){
    day = dayC;
    month = monthC;
    totalTasks = totalTasksC;
    tasksDone = tasksDoneC;
    productivity= productivityC;
    entryNum= ++entryIndex;
  }
  // if the google API integration was successful, the object created with 
  // this constructor would have been used as a single entry in the sheets 
  // database, so the program could later access its attributes for
  // calculations and retrieval
}