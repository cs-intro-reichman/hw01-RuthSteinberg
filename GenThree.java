public class Gen3 {
    public static void main(String[] args) {
        // get 2 numbers from the command-line that represents the min and the max of the range
        int start = Integer.parseInt (args[0]);
        int end = Integer.parseInt (args[1])-1;
        // create 3 varieble from type int, that any varieble is random number between arg[0] and arg[1]
        int a = (int)((Math.random()*(end-start+1)))+start;
        int b = (int)((Math.random()*(end-start+1)))+start;
        int c = (int)((Math.random()*(end-start+1)))+start;
        /*  create new varieble that represents the smallest number from a, b, c. 
        first - the min is the smallest number from only a and b */
        int min = (int)((Math.min (a, b)));
        // check if c is smallest than min
        if(Math.min (a, b) > c) {
            min = c; // if c is smallest than min, c is the final min.
        }
        // print
        System.out.println (a);
        System.out.println (b);
        System.out.println (c);
        System.out.println ("The minimul generated number was: " + min); 
    }
}
