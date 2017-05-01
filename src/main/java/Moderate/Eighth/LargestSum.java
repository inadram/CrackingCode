package Moderate.Eighth;

public class LargestSum {

	public int find(int[] arr) {
		int sum = 0;
		int tempSum = 0;
		for (int anArr : arr) {
			tempSum += anArr;
			if (tempSum < 0) {
				tempSum = 0;
			} else if (tempSum > sum) {
				sum = tempSum;
			}
		}
		return sum;
	}
}
