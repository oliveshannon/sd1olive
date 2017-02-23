import java.util.Scanner;
public class ex6_3 {
  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    System.out.print(number+ (isPalindrome(number) ? " is " : " is not ")
      + "a palindrome.");
  }
  public static boolean isPalindrome(int number) {
    return number == reverse(number) ? true : false;
  }
  public static int reverse(int number) {
    String reverse=""; 
    String n = number + "";
    for (int i=n.length()-1; i>=0; i--) {
// This should reverse the string.
      reverse += n.charAt(i);
    }
    return Integer.parseInt(reverse); 
  }
}