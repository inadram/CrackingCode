package test;

import main.ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Seven.PaintFill;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaintFillTest{

    @Test
    public void test_fill_in_color(){
        String[][] screen=new String[5][5];
        PaintFill paintFill =new PaintFill(screen);
        String color="green";
        paintFill.fill(color);

        assertEquals(paintFill.getColor(2,2),"green");
    }

}