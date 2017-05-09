/**
   * file: BMI.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 7, ex10_2
   * due date: April 20th, 2017
   * version: 1.0
   */
public class BMI {
  private String name;
  private int age;
  private double weight;
  private double height;
  public static final double KILOGRAMS_PER_POUND = 0.45359237;
  public static final double METERS_PER_INCH = 0.0254;
  public BMI (String name, int age, double weight, double height){
    this.name=name;
    this.age=age;
    this. weight= weight;
    this.height= height;
    }
  
  /** Constructs the BMI requested **/
  public BMI (String name, int age, double weight, double feet, double inches){
    this(name, age, weight, inches + feet * 12);
    }
  public double getBMI(){
   double bmi = weight * KILOGRAMS_PER_POUND / ((height* METERS_PER_INCH) 
   *(height* METERS_PER_INCH));
   return Math.round(bmi *100) / 100.0;
  }
  public String getStatus(){
    double bmi= getBMI();
    if (bmi < 18.5)
    return "Underweight";
    else if (bmi < 25)
    return "Normal";
    else if (bmi < 30)
    return "Overweight";
    else
    return "Obese";
    }
  public String getName() {
  return name;
  }
  public int getAge(){
  return age;
  }
  public double getWeight(){
    return weight;
  }
  public double getHeight(){
  return height;
  }
}