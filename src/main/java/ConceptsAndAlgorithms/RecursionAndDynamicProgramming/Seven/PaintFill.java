package ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Seven;

public class PaintFill {
	private String[][] screen;

	public PaintFill(String[][] screen) {
		this.screen = screen;
	}

	public void fill(String color) {
		for (int i = 0; i < screen.length; i++) {
			for (int j = 0; j < screen[i].length; j++) {
				screen[i][j] = color;
			}
		}
	}

	public String getColor(int x, int y) {
		return screen[x][y];
	}
}
