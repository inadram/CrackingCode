import  ConceptsAndAlgorithms.BitManipulation.Lib.BitInteger;
import  ConceptsAndAlgorithms.BitManipulation.Seven.MissingNumber;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MissingNumberTest  {
    @Test
    public void find_missing_number(){
        MissingNumber missingNumber=new MissingNumber();
        ArrayList<BitInteger> array = new ArrayList<BitInteger>();
        BitInteger.SIZE =8;

        array.add(new BitInteger(3));         //3      11
        array.add(new BitInteger(0));           //0       0
        array.add(new BitInteger(2));         //2      10
        array.add(new BitInteger(5));       //5     101
        array.add(new BitInteger(1));           //1       1
        array.add(new BitInteger(8));     //8    1000
        array.add(new BitInteger(7));       //7     111
        array.add(new BitInteger(4));       //4     100

        assertEquals(6, missingNumber.find(array));
    }

}