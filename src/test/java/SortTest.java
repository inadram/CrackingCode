import Moderate.Six.Sort;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortTest {

	@Test
	public void test_find_m_n_to_sort_array() {
		Sort sort = new Sort();
		int[] unOrder = new int[]{4, 10, 11, 14, 18, 17, 9, 6, 19, 28, 36, 50, 48, 22, 59, 60, 88, 14, 90, 100, 120};
		int[] m_n = sort.exec(unOrder);
		assertEquals(1, m_n[0]);
		assertEquals(17, m_n[1]);
	}

}