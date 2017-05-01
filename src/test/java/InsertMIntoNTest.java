import ConceptsAndAlgorithms.BitManipulation.One.InsertMIntoN;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InsertMIntoNTest {

	@Test
	public void test_insert_m_into_n() {
		InsertMIntoN insertMIntoN = new InsertMIntoN();
		int N = 1024;   //10000000000
		int M = 19; //10011
		int i = 2;
		int j = 6;
		int expected = 1100; //10001001100
		int actual = insertMIntoN.add(N, M, i, j);
		assertEquals(expected, actual);
	}

	@Test
	public void test_insert_m_into_n_1s() {
		InsertMIntoN insertMIntoN = new InsertMIntoN();
		int N = 2047;   //11111111111
		int M = 19; //10011
		int i = 2;
		int j = 6;
		int expected = 1999; //11111001111
		int actual = insertMIntoN.add(N, M, i, j);
		assertEquals(expected, actual);
	}

}