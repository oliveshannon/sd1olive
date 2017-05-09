/**
   * file: ex9_1.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 6, ex 9_1
   * due date: April 20th, 2017
   * version: 1.0
   */
public class ex9_1 {
public static void main(String[] args) {
    Rectangle rectangleOne= new Rectangle(4, 40);
    Rectangle rectangleTwo = new Rectangle(3.5, 35.9);
    System.out.println("Info for Rectangle One: ");
    System.out.println("Width: " + rectangleOne.width);
    System.out.println("Height: " + rectangleOne.height);
    System.out.println("Area: " + rectangleOne.getArea());
    System.out.println("Perimeter: " + rectangleOne.getPerimeter());
    System.out.println("Info for Rectangle Two: ");
    System.out.println("Width: " + rectangleTwo.width);
    System.out.println("Height: " + rectangleTwo.height);
    System.out.println("Area: " + rectangleTwo.getArea());
    System.out.println("Perimeter: " + rectangleTwo.getPerimeter());
  }
}