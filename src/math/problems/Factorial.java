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
       int FactNum = 5;

        // Place result here
        int result = cal(FactNum);
        System.out.println("The results of the factorial should be " + result);


    }
    public static int cal (int number ){        //Static method
        if(number == 0)
        {return 1;}
        return number * cal(number - 1);

    }
}
