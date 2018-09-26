import java.util.Scanner;

public class Classwork12 {

	public static void main(String[] args) {
		
	Scanner number =  new Scanner(System.in); //creates a new scanner named "number"
	System.out.print("Enter a number ");
	int a = number.nextInt(); //creates a double defined by variable "a".
	
	if (+ a > 0) //if variable a is greater than or equal to 0, it is positive
	{
		System.out.println(+ a +" is positive"); // prints out this message if the number is positive
	}
	else if (+ a < 0)
	{
		System.out.println(+ a + " is negative"); //prints out this message if the number is a negative number
	}
	else
	{
		System.out.println(+ a + " is just 0"); //prints out this message if the number is equal to 0
	}
	 number.close(); // closes Scanner "number"
	}
}