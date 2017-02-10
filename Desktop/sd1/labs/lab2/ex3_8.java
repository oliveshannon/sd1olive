import java.util.Scanner;
public class ex3_8 {
  public static void main(String[] args) {
  	System.out.print("Enter 3 integers");
  	Scanner input = new Scanner(System.in);
  	int one = input.nextInt();
  	int two = input.nextInt();
  	int three = input.nextInt();
  	int pholder;
  	if (two < one || three < one) {
            if (two < one) {
                pholder = one;
                one = two;
                two = pholder; 
             }
            if (three < one) {
                pholder = one;
                one = three;
                three = pholder;
             }
        }
        if (three < two) {
            pholder = two;
            two = three;
            three = pholder;
        }
        System.out.println(one + ", " + two + ", " + three);
    }
  }
}