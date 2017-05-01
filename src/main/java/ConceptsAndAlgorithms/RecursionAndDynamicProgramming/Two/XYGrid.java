package ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Two;

public class XYGrid {
	public int navigate(int x, int y) {
		if (x < 0 || y < 0) {
			return 0;
		} else if (y == 0 && x == 0) {
			return 1;
		}

		int times = navigate(x - 1, y);
		times += navigate(x, y - 1);
		return times;

	}
}
