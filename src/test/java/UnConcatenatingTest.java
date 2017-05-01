import Moderate.Fourteen.UnConcatenating;
import org.junit.Test;

import java.util.HashSet;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;

public class UnConcatenatingTest {

	@Test
	public void test_unconcatenating() {
		HashSet<String> words = new HashSet<String>();
		words.add("is");
		words.add("looked");
		words.add("just");
		words.add("like");
		words.add("her");
		words.add("brother");
		UnConcatenating unConcatenating = new UnConcatenating(words, "ther");
		int actual = unConcatenating.parse(0, 0, new Hashtable<Integer, Integer>());
		assertEquals(1, actual);
	}

}