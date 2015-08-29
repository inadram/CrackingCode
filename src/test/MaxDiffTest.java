package test;

import main.Questions.ID19286747.MaxDiff;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MaxDiffTest {
    @Test
    public void get_max_diff(){
        MaxDiff maxDiff = new MaxDiff();
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(2);
        input.add(-1);
        input.add(-2);
        input.add(1);
        input.add(-4);
        input.add(2);
        input.add(8);
       int actual = maxDiff.get(input);
        assertEquals(16,actual);
    }

}