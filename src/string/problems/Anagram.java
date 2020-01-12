package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String cat = "cat";
        String army = "army";



        System.out.println(anagram(cat, army));
    }
    public static boolean anagram(String string1, String string2){
            if(string1.length()!= string2.length()){
                return false;
            }


            char[] a = string1.toCharArray();
            char[] b = string2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);

            return Arrays.equals(a,b);

    }
}
