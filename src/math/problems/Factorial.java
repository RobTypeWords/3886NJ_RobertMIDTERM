package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial{

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120. <<<<<<<<<<<<<
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int factorial = 1;
        int numb = 5;

        // Using loop
        for(int i = 1; i<= numb;i++) {
            factorial = factorial * i;
        }

        System.out.println("The Factorial of" + numb + " should be " + factorial);
    }
}
