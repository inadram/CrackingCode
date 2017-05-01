import  ConceptsAndAlgorithms.BitManipulation.Six.SwapBits;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwapBitsTest {

    @Test
    public void swap_odds_and_even_bits_of_binary(){
        SwapBits swapBits=new SwapBits();
        int number =1196;// 01 00 10 10 11 00
        int actual=swapBits.execute(number);

        int expected =2140; //10 00 01 01 11 00
        assertEquals(expected,actual);

    }

}