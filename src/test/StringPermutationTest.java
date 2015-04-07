package test;

import main.dataStructures.arraysAndStrings.three.StringPermutation;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class StringPermutationTest {

    @Test
    public void test_if_two_strings_are_permutation(){
        StringPermutation stringPermutation = new StringPermutation();
        String permutationOne ="asdfg hjkl";
        String permutationTwo ="lkjh gfdsa";
        assertTrue(stringPermutation.check(permutationOne, permutationTwo));

        String one ="asdfg hjkl";
        String two ="lkjhgfdsa";
        assertFalse(stringPermutation.check(one, two));
    }
}
