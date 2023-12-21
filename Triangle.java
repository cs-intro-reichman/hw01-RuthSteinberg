/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
    public static void main(String[] args) {
        //gets 3 numbers from the command-line and define them as a variable of type int
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // define a boolean variable that represent the answaer (if the 3 numbers can form triangle) 
        // check if any two sides is greater than the length of the remaining side
        boolean answer = (((a+b)>c) && ((b+c)>a) && ((a+c)>b));
        // print the 3 numbers and the answer
        System.out.println(a + " , " + b + ", " + c + ": " + answer); 
    }
}

