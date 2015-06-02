package test;

import main.ConceptsAndAlgorothms.RecursionAndDynamicProgramming.Five.Permutations;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class PermutationsTest{

    @Test
    public void test_a_permutation(){
        Permutations permutations = new Permutations();
        ArrayList<String> actualPermutations= permutations.getAllPermutations("a".toCharArray(), 0, new ArrayList<String>());

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("a");
        assertEquals(expected.size(),actualPermutations.size());
        assertEquals(expected.get(0), actualPermutations.get(0));
    }

    @Test
    public void test_ab_permutation(){
        Permutations permutations = new Permutations();
        ArrayList<String> actualPermutations= permutations.getAllPermutations("ab".toCharArray(), 0, new ArrayList<String>());

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("ab");
        expected.add("ba");
        assertEquals(expected.size(),actualPermutations.size());
        for(int i=0 ;i<expected.size();i++) {
            assertEquals(expected.get(i), actualPermutations.get(i));
        }
    }

    @Test
    public void test_abc_permutation(){
        Permutations permutations = new Permutations();
        ArrayList<String> actualPermutations= permutations.getAllPermutations("abc".toCharArray(), 0, new ArrayList<String>());

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("cab");
        expected.add("acb");
        expected.add("abc");
        expected.add("cba");
        expected.add("bca");
        expected.add("bac");
        assertEquals(expected.size(),actualPermutations.size());
        for (String anExpected : expected) {
            assertTrue(actualPermutations.contains(anExpected));
        }
    }

}