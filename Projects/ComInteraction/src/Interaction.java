
import java.util.Scanner;

public class Interaction {

	public static void main(String[] args) {
		
		Scanner keyboard =  new Scanner(System.in); //creates a new Scanner w/ the name "keyboard"
		System.out.print("Enter and integer: ");
		int num = keyboard.nextInt(); //tells the scanner to grab input from the keyboard and enter the next integer as the output
		System.out.println("Your integer is " + num ); //prints the phrase "Your integer is " then prints the integer you previously typed in
		keyboard.close();
	}

}
