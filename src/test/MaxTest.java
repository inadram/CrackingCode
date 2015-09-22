package test;

import main.Moderate.Four.Max;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxTest {

    @Test
    public void test_find_max(){
        Max max = new Max();
        assertEquals(20,max.find(10,20));
        assertEquals(20,max.find2(10,20));
    }

    @Test
    public void test_find_max_big_int(){
        Max max = new Max();
        assertEquals(Integer.MAX_VALUE,max.findOptimise(Integer.MAX_VALUE, -10));
        assertEquals(Integer.MAX_VALUE,max.find2(Integer.MAX_VALUE,-10));
    }

    @Test
    public void test_find_max_two_minus_int(){
        Max max = new Max();
        assertEquals(-10,max.find2(-30,-10));
    }


}