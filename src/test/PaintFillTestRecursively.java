package test;

import main.ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Seven.PaintFillRecursively;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaintFillTestRecursively {

    @Test
    public void test_fill_in_color(){
        String[][] screen=new String[5][5];
        PaintFillRecursively paintFill =new PaintFillRecursively(screen);
        String color="green";
        paintFill.fill(color,2,1);

        assertEquals("green",paintFill.getColor(2,2));
        assertEquals("green",paintFill.getColor(4,4));
        assertEquals("green",paintFill.getColor(0,0));
    }

}