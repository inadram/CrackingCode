import  Moderate.Twelve.SumPair;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SumPairTest {

    @Test
    public void test_find_all_pair_with_expected_sum(){

        SumPair sumPair=new SumPair();
        int[] arr=new int[]{1,7,-3,6,5,10,17,2,8,-5,14,0};
        ArrayList<int[]> actual = sumPair.find(arr, 7);

        assertEquals(actual.get(0)[0], 1);
        assertEquals(actual.get(0)[1], 6);
        assertEquals(actual.get(1)[0], 7);
        assertEquals(actual.get(1)[1], 0);
        assertEquals(actual.get(2)[0], -3);
        assertEquals(actual.get(2)[1], 10);
        assertEquals(actual.get(3)[0], 5);
        assertEquals(actual.get(3)[1], 2);
    }

}