package Moderate.Nine;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
	Map<String, Integer> frequencies = new HashMap<String, Integer>();

	public WordFrequency(String book) {
		String[] bookInArr = book.toLowerCase().split("\\W");

		for (String word : bookInArr) {
			if (!frequencies.containsKey(word)) {
				frequencies.put(word, 1);
			} else {
				frequencies.put(word, frequencies.get(word) + 1);
			}
		}
	}

	public int find(String word) {
		if (word.equals("")) return -1;
		if (frequencies.containsKey(word)) {
			return frequencies.get(word);
		}
		return 0;

	}
}
