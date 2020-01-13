package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String Word = "poop";
        String Reverse = "";
        //Boolean Palindrome = true;


        for(int i = Word.length() - 1; i >= 0; i-- ) {
            Reverse += Word.charAt(i);
            System.out.println(Reverse);
        }

       if (Reverse.equalsIgnoreCase(Word)){
            System.out.println("PALINDROME!");
        } else {
            System.out.println("No a Palindrome!");
        }
    }
}
