/**
   * file: DateObject.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: project
   * due date: May 10th, 2017
   * version: 1.0
   */
public class DateObject {
  public int day;
  public int month;
  public int totalTasks;
  public int tasksDone;
  public double productivity;
  public static int entryIndex = 0;
  public int entryNum;
  public DateObject(int dayC, int monthC,  int totalTasksC, int tasksDoneC, double productivityC){
    day = dayC;
    month = monthC;
    totalTasks = totalTasksC;
    tasksDone = tasksDoneC;
    productivity= productivityC;
    entryNum= ++entryIndex;
  }
  public double getProductivity() {
    return productivity;
  }
}