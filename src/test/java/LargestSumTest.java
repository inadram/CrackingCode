import Moderate.Eighth.LargestSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestSumTest {

	@Test
	public void test_find_largest_sum() {
		LargestSum largestSum = new LargestSum();
		int[] arr = new int[]{2, 3, -8, -1, 2, 4, -2, 3,};
		assertEquals(7, largestSum.find(arr));
	}

}