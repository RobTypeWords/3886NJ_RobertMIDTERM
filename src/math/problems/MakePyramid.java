package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *
        */
        // Nested For loops
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 5 - a; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c <= a; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

  }
