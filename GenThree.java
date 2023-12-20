/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.Random;
public class GenThree {
	public static void main(String[] args) {
	        // create 3 new objects from type Random
	        Random randomNum1 = new Random();
	        Random randomNum2 = new Random();
	        Random randomNum3 = new Random();
	        // get 2 numbers from the command-line that represents the min and the max of the range
	        int start = Integer.parseInt (args[0]);
	        int end = Integer.parseInt (args[1]);
	        // create 3 varieble from type int, that any varieble is random number between arg[0] and arg[1]
	        int a = randomNum1.nextInt (start, end);
	        int b = randomNum2.nextInt (start, end);
	        int c = randomNum3.nextInt (start, end);
	        /*  create new varieble that represents the smallest number from a, b, c. 
	        first - the min is the smallest number from only a and b */
	        int min = Math.min (a, b);
	        // check if c is smallest than min
	        if (Math.min(a, b) > c) {
	            min = c; // if c is smallest than min, c is the final min.
	        }
	        // print
	        System.out.println (a);
	        System.out.println (b);
	        System.out.println (c);
	        System.out.println ("The minimul generated number was: " + min); 
    }
}
	
	

