package ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Four;

import java.util.ArrayList;

public class SetOfStringsIteratively {
	public ArrayList<ArrayList<String>> getSubsets(ArrayList<String> setOfStrings) {
		ArrayList<ArrayList<String>> allSubset = new ArrayList<ArrayList<String>>();
		int max = 1 << setOfStrings.size();
		for (int k = 0; k < max; k++) {
			ArrayList<String> subset = convertToSubset(k, setOfStrings);
			allSubset.add(subset);
		}
		return allSubset;
	}

	public ArrayList<String> convertToSubset(int x, ArrayList<String> set) {
		ArrayList<String> subset = new ArrayList<String>();
		int index = 0;
		for (int k = x; k > 0; k >>= 1) {
			if ((k & 1) == 1) {
				subset.add(set.get(index));
			}
			index++;
		}

		return subset;
	}

}
