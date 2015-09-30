package main.Moderate.Fourteen;

import java.util.HashSet;
import java.util.Hashtable;

public class UnConcatenating {
    private HashSet<String> words;
    private String sentence;

    public UnConcatenating(HashSet<String> words, String sentence) {
        this.words = words;
        this.sentence = sentence;


    }
    //t h e r
    //0 1 2 3
    public  int parse(int wordStart, int wordEnd, Hashtable<Integer, Integer> cache) {
        if (wordEnd >= sentence.length()) {
            return wordEnd - wordStart;
        }
        if (cache.containsKey(wordStart)) {
            return cache.get(wordStart);
        }

        String currentWord = sentence.substring(wordStart, wordEnd + 1);
        boolean validPartial = sentence.contains(currentWord);

		/* break current word */
        int bestExact = parse(wordEnd + 1, wordEnd + 1, cache);
        if (!validPartial || !words.contains(currentWord)) {
            bestExact += currentWord.length();
        }

		/* extend current word */
        int bestExtend = Integer.MAX_VALUE;
        if (validPartial) {
            bestExtend = parse(wordStart, wordEnd + 1, cache);
        }

		/* find best */
        int min = Math.min(bestExact, bestExtend);
        cache.put(wordStart, min);
        return min;
    }


}
