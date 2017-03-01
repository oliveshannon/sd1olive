/**
   * file: ex6_3.java
   * author: Olive Shannon
   * course: CMPT 220
   * assignment: lab 3
   * due date: Feburary 23th, 2017
   * version: 1.0
   */
import java.util.Scanner;
public class ex6_3 {
  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    System.out.print(number+ (isPalindrome(num) ? " is " : " is not ")
      + "a palindrome.");
  }
  public static boolean isPalindrome(int num) {
    return num == reverse(num) ? true : false;
  }
  public static int reverse(int number) {
    String reverse=""; 
    String n = num + "";
    for (int i=n.length()-1; i>=0; i--) {
// This should reverse the string.
      reverse += n.charAt(i);
    }
    return Integer.parseInt(reverse); 
  }
}