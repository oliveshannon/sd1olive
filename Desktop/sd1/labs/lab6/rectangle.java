/**
   * file: Rectangle.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 6, ex9_1
   * due date: April 20th, 2017
   * version: 1.0
   UML DIAGRAM:
   ---------------------
   | class: Rectangle |
   --------------------
   | width: double
   | height: double
   ---------------------
   | getArea(): returns double
   | getPerimeter(): returns double
   ------------------------------
   */
public class Rectangle {
  double width;
  double height;
  Rectangle() {
  width=1;
  height=1;
  }
  Rectangle(double newWidth, double newHeight){
  width= newWidth;
  height= newHeight;
  }
  double getArea(){
  return width*height;
  }
  double getPerimeter(){
  return 2*(width + height);
  }
}