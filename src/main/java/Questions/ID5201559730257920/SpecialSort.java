package Questions.ID5201559730257920;

public class SpecialSort {
	public int[] sort(int[] unsorted) {
		int[] sorted = new int[unsorted.length];
		int index = 0;
		for (int i : unsorted) {
			if (i < 0) {
				sorted[index] = i;
				index += 1;
			}
		}
		for (int i : unsorted) {
			if (i > 0) {
				sorted[index] = i;
				index += 1;
			}
		}

		return sorted;
	}

	public int[] sort2(int[] unsorted) {
		int firstPositivePosition = -1;
		int minusPosition = -1;
		int tempValue;
		for (int i = 0; i < unsorted.length; i++) {
			if (unsorted[i] > 0 && firstPositivePosition < 0) {
				firstPositivePosition = i;
			}
			if (firstPositivePosition > 0 && unsorted[i] < 0) {
				minusPosition = i;
				tempValue = unsorted[firstPositivePosition];
				unsorted[firstPositivePosition] = unsorted[i];
				int currentTemp;
				for (int j = firstPositivePosition + 1; j <= minusPosition; j++) {
					currentTemp = unsorted[j];
					unsorted[j] = tempValue;
					tempValue = currentTemp;
				}
				firstPositivePosition = i + 1;
			}
		}
		return unsorted;
	}
}
