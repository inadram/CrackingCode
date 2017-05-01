package dataStructures.ArraysAndStrings.three;

import java.util.Arrays;

public class StringAnagram {

	public boolean checkWithSort(String one, String two) {
		return one.length() == two.length() && sort(one).equals(sort(two));
	}

	private String sort(String someString) {
		char[] someArray = someString.toCharArray();
		Arrays.sort(someArray);
		return new String(someArray);
	}

	public boolean checkWithOccurrence(String one, String two) {
		if (one.length() != two.length()) {
			return false;
		}

		int[] allCharacters = new int[256];   //assume it have only ascii characters
		for (char character : one.toCharArray()) {
			allCharacters[character]++;
		}

		for (char character : two.toCharArray()) {
			if (--allCharacters[character] < 0) {
				return false;
			}
		}
		return true;
	}
}
