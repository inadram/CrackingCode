import  Questions.ID4809209524781056.ArrayAsInteger;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayAsIntegerTest  {

    @Test
    public void test_increment_array_as_integer(){
        ArrayAsInteger arrayAsInteger=new ArrayAsInteger();
        int[] array = new int[]{1,2,3};
        int[] expectedArray = new int[]{1,2,4};
        int[]  actual=arrayAsInteger.increment(array);
        assertArrayEquals(expectedArray, actual);
    }

    @Test
    public void test_increment_array_as_integer_to_second_value(){
        ArrayAsInteger arrayAsInteger=new ArrayAsInteger();
        int[] array = new int[]{1,2,9};
        int[] expectedArray = new int[]{1,3,0};
        int[]  actual=arrayAsInteger.increment(array);
        assertArrayEquals(expectedArray, actual);
    }

    @Test
    public void test_increment_array_as_integer_to_out_of_boundary(){
        ArrayAsInteger arrayAsInteger=new ArrayAsInteger();
        int[] array = new int[]{9,9,9};
        int[] expectedArray = new int[]{1,0,0,0};
        int[]  actual=arrayAsInteger.increment(array);
        assertArrayEquals(expectedArray, actual);
    }

}