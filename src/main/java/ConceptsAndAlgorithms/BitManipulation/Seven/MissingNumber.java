package ConceptsAndAlgorithms.BitManipulation.Seven;

import ConceptsAndAlgorithms.BitManipulation.Lib.BitInteger;

import java.util.ArrayList;

public class MissingNumber {
	public int find(ArrayList<BitInteger> array) {
		return findMissing(array, 0);
	}

	private int findMissing(ArrayList<BitInteger> array, int i) {
		if (i >= BitInteger.SIZE) {
			return 0;
		}
		ArrayList<BitInteger> ones = new ArrayList<BitInteger>(array.size() / 2);
		ArrayList<BitInteger> zeros = new ArrayList<BitInteger>(array.size() / 2);
		for (BitInteger bitInteger : array) {
			if (bitInteger.get(i) == 1) ones.add(bitInteger);
			else zeros.add(bitInteger);
		}
		boolean isOnesBigger = zeros.size() <= ones.size();
		array = isOnesBigger ? zeros : ones;
		int result = findMissing(array, i + 1);
		return (isOnesBigger) ? result << 1 : result << 1 | 1;
	}

}
