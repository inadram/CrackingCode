import ConceptsAndAlgorithms.BitManipulation.Eight.DrawLine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawLineTest {

	@Test
	public void test_draw_line_from_x1_to_x2() {
		DrawLine drawLine = new DrawLine();
		byte[] screen = new byte[100];
		int width = 80;
		int x1 = 17;
		int x2 = 49;
		int y = 8;
		byte[] actual = drawLine.horizontal(screen, width, x1, x2, y);

		//70
		//16 - 48
		//2 - 6
		assertEquals(127, actual[71]);
		assertEquals(-1, actual[72]);
		assertEquals(-1, actual[73]);
		assertEquals(-1, actual[74]);
		assertEquals(-1, actual[75]);
		assertEquals(-1, actual[76]);
		assertEquals(1, actual[77]);
	}

	@Test
	public void test_draw_line_from_x1_to_x2_on_same_bit() {
		DrawLine drawLine = new DrawLine();
		byte[] screen = new byte[100];
		int width = 80;
		int x1 = 17;
		int x2 = 23;
		int y = 8;
		byte[] actual = drawLine.horizontal(screen, width, x1, x2, y);

		//01111111
		assertEquals(127, actual[72]);
	}

	@Test
	public void test_draw_line_from_x1_to_x2_all_full_house() {
		DrawLine drawLine = new DrawLine();
		byte[] screen = new byte[100];
		int width = 80;
		int x1 = 16;
		int x2 = 32;
		int y = 8;
		byte[] actual = drawLine.horizontal(screen, width, x1, x2, y);

		//01111111
		assertEquals(0, actual[71]);
		assertEquals(-1, actual[72]);
		assertEquals(-1, actual[73]);
		assertEquals(0, actual[74]);
	}

}