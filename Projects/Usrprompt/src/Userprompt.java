
import java.util.Scanner;
public class Userprompt {

	public static void main(String[] args) {
		
		System.out.println("Enter the Length"); //spot to enter length
		Scanner length =  new Scanner(System.in); //Scanner to introduce keyboard input of l (length)
		double l = length.nextDouble();
		
		System.out.println("Enter the Width"); //spot to enter width
		Scanner width =  new Scanner(System.in); // Scanner to introduce keyboard input of w (width)
		double w = width.nextDouble();
		
		System.out.println(+ w + " * " + l + " = an Area of " + (l * w)); //multiples int w and int l to get the total and prints it on a new line as w * l = sum

	}

}
