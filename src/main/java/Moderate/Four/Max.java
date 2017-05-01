package Moderate.Four;

public class Max {
	public int find(int first, int second) {
		int result = first - second;
		int k = sign(result);
		int l = flip(k);
		return k * first + l * second;
	}

	private int sign(int result) {
		return flip((result >> 31 & 1));
	}

	private int flip(int number) {
		return 1 ^ number;
	}

	public int findOptimise(int first, int second) {
		int firstSign = sign(first);
		int secondSign = sign(second);
		first = firstSign * first;
		second = secondSign * second;
		return find(first, second);
	}

	public int find2(int first, int second) {
		//10 5
		// 10 -5
		int firstSign = sign(first);
		int secondSign = sign(second);
		int diffSign = Math.abs(firstSign - secondSign);
		int k = flip(diffSign);
		int firstValue = k * first;
		int secondValue = k * second;
		return find(firstValue, secondValue) + find(first * firstSign * diffSign, second * secondSign * diffSign);
	}
}
