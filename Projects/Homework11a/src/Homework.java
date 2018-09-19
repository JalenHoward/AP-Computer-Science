
import java.util.Scanner;
public class Homework {

	public static void main(String[] args) {
		
		System.out.print("Enter an integer ");
		
		Scanner keyboard =  new Scanner(System.in); //creates a new Scanner w/ the name "keyboard"
		int num = keyboard.nextInt(); //tells the scanner to grab input from the keyboard and enter the next integer as the output
		
		System.out.println("2 * " + num + " = " + (num + num));		
	}

}
