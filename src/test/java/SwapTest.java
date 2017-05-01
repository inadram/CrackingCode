import  Moderate.One.Swap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwapTest {

    @Test
    public void test_swap_numbers(){
         int[] numbers = new int[]{10,11};
         Swap swap=new Swap();
         int [] actual =swap.exec(numbers);
        assertEquals(actual[0],11);
        assertEquals(actual[1],10);
    }

}