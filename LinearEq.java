/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
    public static void main(String[] args){
        //get 3 numbers from the command-line and define them as a variable of type double
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        // calculate x: a*x+b=c > a*x=c-d > x=(c-d)/a.
        double x = (c-b)/a;
        // print
        System.out.println("x = " + x);  
    }
}
