package ConceptsAndAlgorithms.RecursionAndDynamicProgramming.One;


public class DynamicStaircase {

	public int navigate(int steps, int[] map) {
		if (steps == 0) {
			return 1;
		} else if (steps < 0) {
			return 0;
		} else if (map[steps] != 0) {
			return map[steps];
		}
		int times = navigate(steps - 1, map);
		times += navigate(steps - 2, map);
		times += navigate(steps - 3, map);
		map[steps] = times;
		return map[steps];
	}
}
