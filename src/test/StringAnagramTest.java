package test;

import main.dataStructures.arraysAndStrings.three.StringAnagram;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class StringAnagramTest {

    String anagramOne = "asdfg hjkl";
    String anagramTwo = "la ksjdhfg";
    String one = "asdfghjkl ";
    String two = "l kjhtfads";

    StringAnagram stringAnagram;

    @BeforeClass
    public void setup() {
        stringAnagram = new StringAnagram();
    }

    @Test
    public void test_if_two_strings_are_anagram_with_sort() {
        assertTrue(stringAnagram.checkWithSort(anagramOne, anagramTwo));
        assertFalse(stringAnagram.checkWithSort(one, two));
    }

    @Test
    public void test_if_two_strings_are_anagram_with_occurrence() {
        assertTrue(stringAnagram.checkWithOccurrence(anagramOne, anagramTwo));
        assertFalse(stringAnagram.checkWithOccurrence(one, two));
    }

}
