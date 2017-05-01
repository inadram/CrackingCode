package ConceptsAndAlgorithms.RecursionAndDynamicProgramming.One;

public class Staircase {

	public int navigate(int steps) {
		if (steps == 0) {
			return 1;
		} else if (steps < 0) {
			return 0;
		}
		int times = navigate(steps - 1);
		times += navigate(steps - 2);
		times += navigate(steps - 3);
		return times;
	}
}
