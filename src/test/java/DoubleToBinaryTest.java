import  ConceptsAndAlgorithms.BitManipulation.Two.DoubleToBinary;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DoubleToBinaryTest{

    @Test
    public void test_convert_binary_to_double(){
        DoubleToBinary doubleToBinary = new DoubleToBinary();
        double doubleNumber=0.72;
        String actual =doubleToBinary.convert(doubleNumber);
        String actual2 = doubleToBinary.printBinary2(doubleNumber);
        assertEquals("ERROR",actual);
        assertEquals("ERROR",actual2);
    }


    @Test
    public void test_convert_binary_to_another_double(){
        DoubleToBinary doubleToBinary = new DoubleToBinary();
        double doubleNumber=0.75;
        String actual =doubleToBinary.convert(doubleNumber);
        String actual2 = doubleToBinary.printBinary2(doubleNumber);
        assertEquals(".11",actual);
        assertEquals(".11",actual2);
    }

}