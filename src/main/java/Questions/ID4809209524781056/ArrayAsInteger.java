package Questions.ID4809209524781056;

public class ArrayAsInteger {
	public int[] increment(int[] array) {
		int[] incrementedArray = incrementByOne(array, array.length - 1);
		return (array[0] < 10) ? incrementedArray : extendedBoundary(array.length + 1);
	}

	private int[] extendedBoundary(int length) {
		int[] array = new int[length];
		array[0] = 1;
		return array;
	}

	private int[] incrementByOne(int[] array, int i) {
		array[i] = array[i] + 1;
		if (array[i] >= 10 && i > 0) array[i] = array[i] % 10;
		else return array;
		return incrementByOne(array, i - 1);
	}
}
