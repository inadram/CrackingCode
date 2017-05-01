import  ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Eight.CalculateCent;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateCentTest {

    @Test
    public void test_calculate_ways_10(){
        CalculateCent calculateCent=new CalculateCent();
        int actual =calculateCent.execute(10,25);
        assertEquals(4,actual);
    }

    @Test
    public void test_calculate_ways_20(){
        CalculateCent calculateCent=new CalculateCent();
        int actual =calculateCent.execute(20,25);
        assertEquals(9,actual);
    }

}