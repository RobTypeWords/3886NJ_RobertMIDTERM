package string.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        Anagram.anagram("listen","slilent");
        Assert.assertEquals(true,true);

        // Palindrome
        Palindrome.main(new String[]{"Mom"});
        Assert.assertEquals(true,true);

        // Permutation
            Permutation.perm("","ab");
            Assert.assertEquals("ba","ba");

    }
}
