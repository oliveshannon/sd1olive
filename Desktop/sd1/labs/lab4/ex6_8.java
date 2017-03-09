/**
   * file: ex6_8.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 4
   * due date: Febuary 9th, 2017
   * version: 1.0
   */
public class ex6_8 {
  public static void main(String [] args) {
    System.out.println(
      "Celsius   Fahrenheit   |   Fahrenheit   Celsius\n" +
      "__________________________________________________" );
    double c= 40.0;
    double f= 120.0;
    System.out.println( 40.0 + "       " + celsiusToFahrenheit(c) +
      "            " + 120.0 + "         " + fahrenheitToCelsius(f) );
    c= c-1.0;
    f= f-10.0;
    System.out.println( 39.0 + "       " + celsiusToFahrenheit(c) +
      "            " + 110.0 + "         " + fahrenheitToCelsius(f) );
    c= c-7.0;
    f= f-70.0;
    System.out.println("...");
    System.out.println( 32.0 + "       " + celsiusToFahrenheit(c) +
      "            " + 40.0 + "         " + fahrenheitToCelsius(f) );
    c= c-1.0;
    f= f-10.0;
    System.out.println( 31.0 + "       " + celsiusToFahrenheit(c) +
      "            " + 30.0 + "         " + fahrenheitToCelsius(f) );
    }
    public static double celsiusToFahrenheit(double c) {
      return (9.0/5) * c + 32;
    }
    public static double fahrenheitToCelsius(double f) {
      return (5.0/9) * (f - 32);
    }
  
}