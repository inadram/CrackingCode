package ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Seven;

public class PaintFillRecursively {
	private String[][] screen;

	public PaintFillRecursively(String[][] screen) {
		this.screen = screen;
	}

	public void fill(String color, int x, int y) {
		fillRecursively(color, x, y, screen);
	}

	private void fillRecursively(String color, int x, int y, String[][] screen) {
		if (x >= 0 && y >= 0 && x < screen.length && y < screen[0].length) {
			if (screen[x][y] != color) {
				screen[x][y] = color;
				fillRecursively(color, x - 1, y, screen);
				fillRecursively(color, x + 1, y, screen);
				fillRecursively(color, x, y - 1, screen);
				fillRecursively(color, x, y + 1, screen);
			}
		}

	}

	public String getColor(int x, int y) {
		return screen[x][y];
	}
}
