package Moderate.Twelve;

import java.util.ArrayList;

public class SumPair {
	public ArrayList<int[]> find(int[] arr, int sum) {
		for (int i = 0; i < arr.length - 1; i++) {
			partialSum(arr, sum, i, i + 1);
		}
		return mySumArray;
	}

	ArrayList<int[]> mySumArray = new ArrayList<int[]>();

	private void partialSum(int[] arr, int sum, int first, int second) {
		if (second < arr.length) {
			if (sum == arr[first] + arr[second]) mySumArray.add(new int[]{arr[first], arr[second]});
			partialSum(arr, sum, first, second + 1);
		}
	}
}
