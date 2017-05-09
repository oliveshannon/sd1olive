/**
   * file: Location.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 6, ex9_13
   * due date: April 20th, 2017
   * version: 1.0
   UML DIAGRAM:
   ---------------------
   | class: Location |
   --------------------
   | row: int
   | column: int
   | maxValue: double
   ---------------------
   | 
   ------------------------------
   */
public class Location {
  int row;
  int column;
  double maxValue;
  Location(double [][] a){
  maxValue=a[0][0];
  row=0;
  column=0;
  for (int i=0; i< a.length; i++){
    for (int j=0; j < a[i].length; j++) {
      if (a[i][j] > maxValue){
        maxValue= a[i][j];
        row= i;
        column= j;
        }
      }
    }
  }
}