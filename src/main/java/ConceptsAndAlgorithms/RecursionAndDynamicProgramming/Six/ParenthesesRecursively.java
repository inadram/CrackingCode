package ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Six;

import java.util.HashSet;

public class ParenthesesRecursively {
	public HashSet<String> getAll(int i) {
		if (i == 1) {
			HashSet<String> parentheses = new HashSet<String>();
			parentheses.add("()");
			return parentheses;
		}
		HashSet<String> parentheses = getAll(--i);
		HashSet<String> allParentheses = new HashSet<String>();
		for (String str : parentheses) {
			allParentheses = generate(str, 0, allParentheses);
			if (!allParentheses.contains("()" + str)) {
				allParentheses.add("()" + str);
			}
		}
		return allParentheses;
	}

	private HashSet<String> generate(String str, int index, HashSet<String> allParentheses) {
		if (index < str.length() && str.charAt(index) != '(') {
			String prefix = str.substring(0, index);
			String suffix = str.substring(index, str.length());
			allParentheses.add(prefix.concat("()").concat(suffix));
		}
		if (index >= str.length()) {
			return allParentheses;
		}
		return generate(str, ++index, allParentheses);
	}
}
