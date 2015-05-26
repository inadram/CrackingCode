package test;

import junit.framework.TestCase;
import main.ConceptsAndAlgorothms.RecursionAndDynamicProgramming.Two.XYGridOffLimit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;

public class XYGridOffLimitTest extends TestCase {
    ArrayList<Point> occupied =new ArrayList<Point>();
    XYGridOffLimit grid = new XYGridOffLimit(occupied);

    @Test
    public void test_grid_with_two_cell_1x0_off() {
        occupied.add(new Point(1,0));
        assertEquals(1, grid.navigate(1, 1));
    }

    @Test
    public void test_grid_with_three_cell_1x0_off() {
        occupied.add(new Point(1,0));
        assertEquals(3, grid.navigate(2, 2));
    }

    @Test
    public void test_grid_with_four_cell_1x0_off() {
        occupied.add(new Point(1,0));
        assertEquals(10, grid.navigate(3, 3));
    }

    @Test
    public void test_grid_with_four_cell_1x0_2x2_off() {
        occupied.add(new Point(1,0));
        occupied.add(new Point(2,2));
        assertEquals(6, grid.navigate(3, 3));
    }
}