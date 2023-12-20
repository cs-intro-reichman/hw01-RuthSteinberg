/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		//get 2 numbers from the command-line and define them as a variable of type int
	        int num1 = Integer.parseInt(args[0]);
	        int num2 = Integer.parseInt(args[1]);
	        // define a new variable "sum" that represents the sum of num1 and num2 
	        int sum = num1+num2;
	        // print
	        System.err.println(num1 + " + " + num2 + " = " + sum);	
	}
}
