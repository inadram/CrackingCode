package test;

import main.Moderate.Eleven.Random;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RandomTest {

    @Test
    public void test_rand_7(){
        Random random = new Random();
        HashSet hashSet = new HashSet();
        for(int i=0;i<1000;i++) {
            assertTrue(random.rand7() <= 7);
            assertTrue(random.rand7() >= 0);
            hashSet.add(random.rand7());
        }
        assertEquals(hashSet.size(),8);
    }
}