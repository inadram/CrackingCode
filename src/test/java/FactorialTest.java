import Moderate.Three.Factorial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

	@Test
	public void test_find_trailing_zeros() {
		Factorial factorial = new Factorial(10);
		assertEquals(2, factorial.zeros());
	}

	@Test
	public void test_find_trailing_zeros_5() {
		Factorial factorial = new Factorial(5);
		assertEquals(1, factorial.zeros());
	}

	@Test
	public void test_find_trailing_zeros_10_optimise() {
		Factorial factorial = new Factorial(10);
		assertEquals(2, factorial.optimiseZeros());
	}

	@Test
	public void test_find_trailing_zeros_101_optimise() {
		Factorial factorial = new Factorial(101);
		assertEquals(24, factorial.optimiseZeros());
	}

	@Test
	public void test_find_trailing_zeros_101_multiples() {
		Factorial factorial = new Factorial(101);
		assertEquals(24, factorial.multiples5());
	}

}