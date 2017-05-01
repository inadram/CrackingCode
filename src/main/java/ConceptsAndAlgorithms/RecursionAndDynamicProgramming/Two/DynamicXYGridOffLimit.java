package ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Two;

import java.awt.*;
import java.util.ArrayList;

public class DynamicXYGridOffLimit {
	private ArrayList<Point> occupied;

	public DynamicXYGridOffLimit(ArrayList<Point> occupied) {
		this.occupied = occupied;
	}

	public int navigate(int x, int y, ArrayList<Point> cache) {
		if (cache.contains(new Point(x, y))) {
			return 1;
		} else if (occupied(x, y) || x < 0 || y < 0) {
			return 0;
		} else if (y == 0 && x == 0) {
			cache.add(new Point(x, y));
			return 1;
		}

		int times = navigate(x - 1, y, cache);
		times += navigate(x, y - 1, cache);
		return times;

	}

	private boolean occupied(int x, int y) {
		return occupied.contains(new Point(x, y));
	}
}
