import Questions.ID5201559730257920.SpecialSort;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecialSortTest {

	@Test
	public void test_sort_array() {
		SpecialSort specialSort = new SpecialSort();
		int[] unsorted = new int[10];
		unsorted[0] = -1;
		unsorted[1] = 1;
		unsorted[2] = 3;
		unsorted[3] = -2;
		unsorted[4] = 2;
		int[] actual = specialSort.sort(unsorted);
		int[] expected = new int[10];
		expected[0] = -1;
		expected[1] = -2;
		expected[2] = 1;
		expected[3] = 3;
		expected[4] = 2;
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], actual[i]);
		}
	}

	@Test
	public void test_sort_array2() {
		SpecialSort specialSort = new SpecialSort();
		int[] unsorted = new int[10];
		unsorted[0] = -1;
		unsorted[1] = 1;
		unsorted[2] = 3;
		unsorted[3] = -2;
		unsorted[4] = 2;
		int[] actual = specialSort.sort2(unsorted);
		int[] expected = new int[10];
		expected[0] = -1;
		expected[1] = -2;
		expected[2] = 1;
		expected[3] = 3;
		expected[4] = 2;
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], actual[i]);
		}
	}

}