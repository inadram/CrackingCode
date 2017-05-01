import ConceptsAndAlgorithms.BitManipulation.Three.NextNumber;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NextNumberTest {

	@Test
	public void test_get_next_bigger_number() {
		NextNumber nextNumber = new NextNumber();
		int number = 13948; //11011001111100
		int nextBiggerNumber = 13967; //11011010001111
		int actual = nextNumber.getBigger(number);
		assertEquals(nextBiggerNumber, actual);
	}

	@Test
	public void test_get_next_bigger_number_with_no_zero() {
		NextNumber nextNumber = new NextNumber();
		int number = 31; //11111
		int nextBiggerNumber = 47; //101111
		int actual = nextNumber.getBigger(number);
		assertEquals(nextBiggerNumber, actual);
	}

	@Test
	public void test_get_next_smaller_number() {
		NextNumber nextNumber = new NextNumber();
		int number = 13948; //11011001111100
		int nextSmallerNumber = 13947; //11011001111011
		int actual = nextNumber.getSmaller(number);
		assertEquals(nextSmallerNumber, actual);
	}

	@Test
	public void test_get_next_smaller_number_with_no_zero() {
		NextNumber nextNumber = new NextNumber();
		int number = 31; //11111
		int nextSmallerNumber = 30; //11110
		int actual = nextNumber.getSmaller(number);
		assertEquals(nextSmallerNumber, actual);
	}
}