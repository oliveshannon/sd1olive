import java.util.Scanner;
public class ex2_1 {
  public static void main(String[] args) {
    System.out.print("Enter a temp. in Celsius");
    Scanner input = new Scanner(System.in);
    double celsius = input.nextDouble();
    double fahrenheit = 9 / 5 celsius+32;
    System.out.println(celsius + "Celsius is" + " " + fahrenheit);
  }
}