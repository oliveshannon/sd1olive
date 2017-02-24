
import java.util.Scanner;
public class Driver_lab3 {
  public static void main (String[] args){
    Scanner input= new Scanner(System.in);  
    while (true){ 
    double x1 = input.nextDouble(); 
    if (x1 == 0.0){
      break;
    }   
    double y1= input.nextDouble();
    double x2 = input.nextDouble();
    double y2= input.nextDouble();
    double p = input.nextDouble();
    double distance+ CalcDistances(x1, x2, y1, y2, p);
    System.out.println(distance);
    }
  }
  public static double CalcDistances(double x1, double x2,
      double y1, double y2, double p) {
    double distance = Math.pow(math.pow(Math.abs(x1-x2), p) 
      + Math.pow(Math.abs(y1-y2), p), 1.0/p);
    return distance;
  }
}