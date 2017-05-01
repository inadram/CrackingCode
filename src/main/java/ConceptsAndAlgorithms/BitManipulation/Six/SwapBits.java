package ConceptsAndAlgorithms.BitManipulation.Six;

public class SwapBits {

	public int execute(int number) {
		// 01 00 10 10 11 00

		// 00 10 01 01 01 10
		// 10 01 01 01 10 00
		int rightShift = number >> 1 & 0x55555555;
		int leftShift = number << 1 & 0xaaaaaaaa;

		return rightShift | leftShift;
	}
}
