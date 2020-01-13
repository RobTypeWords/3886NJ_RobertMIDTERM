package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */


        // Method call
           perm("", "abcd");    // blank and input

    }

    public static void perm(String empty, String word){
        int Wsize = word.length();
        if(Wsize ==0){
            System.out.println(empty + word);

        } else{
                for(int i=0; i<Wsize; i++){
                    perm(empty + word.charAt(i), word.substring(0, i)  );
                }
              }
        }


    }



