import Moderate.Eleven.Random;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RandomTest {

	@Test
	public void test_rand_7() {
		Random random = new Random();
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		hashMap.put(0, 1);
		hashMap.put(1, 1);
		hashMap.put(2, 1);
		hashMap.put(3, 1);
		hashMap.put(4, 1);
		hashMap.put(5, 1);
		hashMap.put(6, 1);
		for (int i = 0; i < 100000; i++) {
			int rand7 = random.rand7();
			assertTrue(rand7 <= 6);
			assertTrue(rand7 >= 0);
			hashMap.put(rand7, hashMap.get(rand7) + 1);
		}
		assertEquals(hashMap.size(), 7);
		assertTrue(hashMap.get(0) > 14000);
		assertTrue(hashMap.get(1) > 14000);
		assertTrue(hashMap.get(2) > 14000);
		assertTrue(hashMap.get(3) > 14000);
		assertTrue(hashMap.get(4) > 14000);
		assertTrue(hashMap.get(5) > 14000);
		assertTrue(hashMap.get(6) > 14000);
	}
}