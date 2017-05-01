import ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Six.ParenthesesRecursively;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParenthesesRecursivelyTest {

	@Test
	public void test_two_parentheses_recursively() {
		ParenthesesRecursively parenthesesRecursively = new ParenthesesRecursively();
		HashSet<String> actual = parenthesesRecursively.getAll(2);
		HashSet<String> expected = new HashSet<String>();
		expected.add("()()");
		expected.add("(())");
		for (String str : expected) {
			assertTrue(actual.contains(str));
		}
		assertEquals(expected.size(), actual.size());
	}

	@Test
	public void test_three_parentheses_recursively() {
		ParenthesesRecursively parenthesesRecursively = new ParenthesesRecursively();
		HashSet<String> actual = parenthesesRecursively.getAll(3);
		HashSet<String> expected = new HashSet<String>();
		expected.add("()()()");
		expected.add("(())()");
		expected.add("()(())");
		expected.add("(()())");
		expected.add("((()))");
		for (String str : expected) {
			assertTrue(actual.contains(str));
		}
		assertEquals(expected.size(), actual.size());
	}
}