import dataStructures.ArraysAndStrings.three.StringAnagram;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


public class StringAnagramTest {

	String anagramOne = "asdfg hjkl";
	String anagramTwo = "la ksjdhfg";
	String one = "asdfghjkl ";
	String two = "l kjhtfads";

	StringAnagram stringAnagram;

	@Before
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
