package test;

import main.Moderate.Twelve.SumPair;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class SumPairTest {

    @Test
    public void test_find_all_pair_with_expected_sum(){

        SumPair sumPair=new SumPair();
        int[] arr=new int[]{1,7,-3,6,5,9,17,2,8,-5,14};
        ArrayList<int[]> actual = sumPair.find(arr, 7);

        assertTrue(actual.contains(new int[]{1,6}));
        assertTrue(actual.contains(new int[]{7}));
        assertTrue(actual.contains(new int[]{5,2}));
        assertTrue(actual.contains(new int[]{-3,9,1}));
        assertTrue(actual.contains(new int[]{-3,-5,8,5,2}));
        assertTrue(actual.contains(new int[]{-3,-5,8,7}));
        assertTrue(actual.contains(new int[]{-3,-5,8,1,6}));
        assertTrue(actual.contains(new int[]{-3,-5,7,2,1,5}));
        assertTrue(actual.contains(new int[]{-3,8,2}));
        assertTrue(actual.contains(new int[]{9,-5,1,2}));
    }

}