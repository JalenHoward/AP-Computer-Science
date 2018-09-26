import java.util.Scanner;

public class Classwork12 {

	public static void main(String[] args) {
		
	Scanner number =  new Scanner(System.in); //creates a new scanner named "number"
	System.out.print("Enter a number ");
	double a = number.nextDouble(); //creates a double defined by variable "a".
	
	if (+ a >= 0) //if variable a is greater than or equal to 0, it is positive
	{
		System.out.println(+ a +" is positive"); // prints out this message if true
	}
	else
	{
		System.out.println(+ a + " is not positive"); //prints out this message if false
	}
	 number.close(); // closes Scanner "number"
	}
}