import Questions.ID16759664.SmallRange;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SmallRangeTest {

	@Test
	public void test_find_smallest_range() {
		SmallRange smallRange = new SmallRange();

		int[] actualRange = smallRange.find(new int[]{4, 10, 15, 24, 26}, new int[]{0, 9, 12, 20}, new int[]{5, 18, 22, 30});
		assertEquals(24, actualRange[0]);
		assertEquals(20, actualRange[1]);
		assertEquals(22, actualRange[2]);


	}

	@Test
	public void test_find_smallest_range_with_array_list() {
		SmallRange smallRange = new SmallRange();

		ArrayList<Integer> first = new ArrayList<Integer>();
		first.add(4);
		first.add(10);
		first.add(15);
		first.add(24);
		first.add(26);

		ArrayList<Integer> second = new ArrayList<Integer>();
		second.add(0);
		second.add(9);
		second.add(12);
		second.add(20);

		ArrayList<Integer> third = new ArrayList<Integer>();
		third.add(5);
		third.add(18);
		third.add(22);
		third.add(30);

		int[] actualRange = smallRange.find(first, second, third);
		assertEquals(24, actualRange[0]);
		assertEquals(20, actualRange[1]);
		assertEquals(22, actualRange[2]);


	}


}