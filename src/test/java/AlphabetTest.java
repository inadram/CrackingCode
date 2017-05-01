import  Moderate.Seven.Alphabet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlphabetTest {

    @Test
    public void test_convert_int_to_alphabet(){
        Alphabet alphabet = new Alphabet();
        String actual = alphabet.convert(456743209);
        assertEquals(" four hundred and fifty six million seven hundred and forty three thousand two hundred and nine", actual) ;
    }

}