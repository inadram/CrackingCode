package test;

import junit.framework.TestCase;
import main.ConceptsAndAlgorothms.RecursionAndDynamicProgramming.Two.XYGrid;
import org.testng.annotations.Test;

public class XYGridTest extends TestCase {

    XYGrid grid = new XYGrid();

    @Test
    public void test_grid_with_two_cell() {
        assertEquals(2, grid.navigate(1, 1));
    }

    @Test
    public void test_grid_with_three_cell() {
        assertEquals(6, grid.navigate(2, 2));
    }

    @Test
    public void test_grid_with_four_cell() {
        assertEquals(20, grid.navigate(3, 3));
    }

}