
import java.util.Scanner;
public class Userprompt {

	public static void main(String[] args) {
		
		Scanner key =  new Scanner(System.in); //Scanner to introduce keyboard input
		
		System.out.println("Enter the Length"); //spot to enter length
		double l = key.nextDouble(); //introduces the double "l" for length
		
		System.out.println("Enter the Width"); //spot to enter width
		double w = key.nextDouble(); //introduces the double "w" for width 


		System.out.println(+ w + " * " + l + " = an Area of " + (l * w)); //multiples double w and double l to get the total and prints it on a new line as w * l = sum
		key.close();
	}

}
