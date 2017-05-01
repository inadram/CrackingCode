package ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Three;

public class MagicIndex {

	public int find(int[] sortedArray, int index) {
		if (index >= sortedArray.length) {
			return -1;
		}
		if (sortedArray[index] == index) {
			return sortedArray[index];
		}
		return find(sortedArray, ++index);
	}
}
