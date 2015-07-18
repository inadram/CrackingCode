package test;

import main.ConceptsAndAlgorithms.BitManipulation.Three.NextNumberBruteForce;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NextNumberBruteForceTest {

    @Test
    public void test_get_next_bigger_number() {
        NextNumberBruteForce nextNumber = new NextNumberBruteForce();
        int number = 17; //10001
        int nextBiggerNumber = 18; //10010
        int actual = nextNumber.getBigger(number);
        assertEquals(nextBiggerNumber, actual);
    }

    @Test
    public void test_get_next_smaller_number() {
        NextNumberBruteForce nextNumber = new NextNumberBruteForce();
        int number = 17; //10001
        int nextSmallerNumber = 12; //1100
        int actual = nextNumber.getSmaller(number);
        assertEquals(nextSmallerNumber, actual);
    }

}