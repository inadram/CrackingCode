package test;

import main.ConceptsAndAlgorothms.RecursionAndDynamicProgramming.One.Staircase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StaircaseTest {

    @Test
    public void staircase_with_1_step() {

        Staircase staircase = new Staircase();
        assertEquals(1, staircase.navigate(1));
    }

    @Test
    public void staircase_with_2_step() {

        Staircase staircase = new Staircase();
        assertEquals(2, staircase.navigate(2));
    }

    @Test
    public void staircase_with_3_step() {

        Staircase staircase = new Staircase();
        assertEquals(4, staircase.navigate(3));
    }

    @Test
    public void staircase_with_4_step() {

        Staircase staircase = new Staircase();
        assertEquals(7, staircase.navigate(4));
    }

    @Test
    public void staircase_with_5_step() {

        Staircase staircase = new Staircase();
        assertEquals(13, staircase.navigate(5));
    }
}