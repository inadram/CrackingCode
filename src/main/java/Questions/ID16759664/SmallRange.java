package Questions.ID16759664;

import java.util.ArrayList;

public class SmallRange {
	public int[] find(int[] one, int[] two, int[] three) {
		int[] range = new int[3];
		int diff = Integer.MAX_VALUE;
		for (int oneNumber : one) {
			for (int twoNumber : two) {
				for (int threeNumber : three) {
					int currentDiff = Math.abs(Math.max(Math.max(oneNumber, twoNumber), threeNumber) - Math.min(Math.min(oneNumber, twoNumber), threeNumber));
					if (currentDiff < diff) {
						diff = currentDiff;
						range[0] = oneNumber;
						range[1] = twoNumber;
						range[2] = threeNumber;
					}
				}
			}
		}
		return range;
	}

	public int[] find(ArrayList<Integer> one, ArrayList<Integer> two, ArrayList<Integer> three) {
		int[] range = new int[3];
		int diff = Integer.MAX_VALUE;
		while (one.size() > 0 && two.size() > 0 && three.size() > 0) {
			int numberOne = one.get(0);
			int numberTwo = two.get(0);
			int numberThree = three.get(0);
			int min = Math.min(Math.min(numberOne, numberTwo), numberThree);
			if (numberOne == min) {
				one.remove(0);
			} else if (numberTwo == min) {
				two.remove(0);
			} else {
				three.remove(0);
			}
			int max = Math.max(Math.max(numberOne, numberTwo), numberThree);
			int currentDiff = max - min;
			if (currentDiff < diff) {
				diff = currentDiff;
				range[0] = numberOne;
				range[1] = numberTwo;
				range[2] = numberThree;
			}
		}

		return range;
	}
}
