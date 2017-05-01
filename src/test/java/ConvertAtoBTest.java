import  ConceptsAndAlgorithms.BitManipulation.Five.ConvertAtoB;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConvertAtoBTest  {

    @Test
    public void get_number_of_bits_require_to_convert_a_to_b(){
        ConvertAtoB convertAtoB = new ConvertAtoB();
        //110010000
        //001000110
        assertEquals(6,convertAtoB.get(400,70));
        assertEquals(6,convertAtoB.get(70,400));
        assertEquals(6,convertAtoB.getWithXOR(70,400));
    }

}