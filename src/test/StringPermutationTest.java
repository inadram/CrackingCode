package test;

import main.dataStructures.ArraysAndStrings.three.StringPermutation;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class StringPermutationTest {

    String permutationOne = "asdfg hjkl";
    String permutationTwo = "lkjh gfdsa";
    String one = "asdfg hjkl";
    String two = "lkjhgfdsa";

    StringPermutation stringPermutation;

    @Before
    public void setup() {
        stringPermutation = new StringPermutation();
    }

    @Test
    public void test_if_two_strings_are_permutation() {
        assertTrue(stringPermutation.check(permutationOne, permutationTwo));
        assertFalse(stringPermutation.check(one, two));
    }

    @Test
    public void test_if_two_strings_are_permutation_with_stringBuilder() {
        assertTrue(stringPermutation.checkRevers(permutationOne, permutationTwo));
        assertFalse(stringPermutation.checkRevers(one, two));
    }
}
