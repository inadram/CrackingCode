package test;

import main.ConceptsAndAlgorothms.RecursionAndDynamicProgramming.One.DynamicStaircase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DynamicStaircaseTest {

    DynamicStaircase staircase = new DynamicStaircase();

    @Test
    public void staircase_with_1_step() {
        assertEquals(1, staircase.navigate(1, new int[10]));
    }

    @Test
    public void staircase_with_2_step() {
        assertEquals(2, staircase.navigate(2, new int[10]));
    }

    @Test
    public void staircase_with_3_step() {
        assertEquals(4, staircase.navigate(3, new int[10]));
    }

    @Test
    public void staircase_with_4_step() {
        assertEquals(7, staircase.navigate(4, new int[10]));
    }

    @Test
    public void staircase_with_5_step() {
        assertEquals(13, staircase.navigate(5, new int[10]));
    }
}