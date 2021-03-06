package ConceptsAndAlgorithms.BitManipulation.Three;

import ConceptsAndAlgorithms.BitManipulation.Lib.HowManyOnes;
import ConceptsAndAlgorithms.BitManipulation.Lib.Utils;

public class NextNumber {
	public int getBigger(int number) {
		int i = findNoneTrailingZeroPosition(number);
		int numberOfOnes = HowManyOnes.get(((1 << i) - 1) & number);
		number = Utils.clearRightSide(number, i + 1);  // 11111
		number = Utils.update(number, i + 1, 1);        //101111
		return number | ((1 << (numberOfOnes - 1)) - 1);
	}

	public int getSmaller(int number) {
		int i = findTrailingZeroPosition(number);
		number = Utils.clearRightSide(number, i + 1);
		return number | ((1 << i) - 1);
	}


	private int findTrailingZeroPosition(int number) {
		for (int i = 1; number >= 1; i++) {
			if (number % 2 == 0) {
				int temp = number / 2;
				if (temp % 2 != 0) return i;
			}
			number /= 2;
		}
		return 0;
	}

	private int findNoneTrailingZeroPosition(int number) {
		int size = 0;
		for (int i = 1; number >= 0; i++) {
			size = i;
			if (number % 2 != 0) {
				int temp = number / 2;
				if (temp % 2 == 0) return i;
			}
			number /= 2;
		}
		return size;
	}
}
