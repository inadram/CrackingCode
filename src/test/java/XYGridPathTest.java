import junit.framework.TestCase;
import  ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Two.XYGridPath;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

public class XYGridPathTest extends TestCase {

    XYGridPath grid = new XYGridPath();

    @Test
    public void test_grid_with_two_cell() {
        assertEquals(2, grid.navigate(1, 1,new ArrayList<Point>()));
    }

    @Test
    public void test_grid_with_three_cell() {
        assertEquals(6, grid.navigate(2, 2,new ArrayList<Point>()));
    }

    @Test
    public void test_grid_with_four_cell() {
        assertEquals(20, grid.navigate(3, 3,new ArrayList<Point>()));
    }

}