import  KnowledgeBase.Six.CircularArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircularArrayTest {

    @Test
    public void test_circular_array(){
        CircularArray circularArray = new CircularArray(5);
        circularArray.set(0,"a");
        circularArray.set(1,"b");
        circularArray.set(2,"c");
        circularArray.set(3,"d");
        circularArray.set(4,"e");
        circularArray.set(5,"f");
        circularArray.set(6,"g");
        assertEquals("f",circularArray.get(0));
    }

    @Test
    public void test_circular_array_for_negative_index(){
        CircularArray circularArray = new CircularArray(5);
        circularArray.set(0,"a");
        circularArray.set(1,"b");
        circularArray.set(2,"c");
        circularArray.set(3,"d");
        circularArray.set(4,"e");
        circularArray.set(5,"f");
        circularArray.set(6,"g");
        circularArray.set(-2,"h");
        assertEquals("e", circularArray.get(-1));
        assertEquals("h", circularArray.get(-2));
    }

    @Test
    public void test_shift_right_array(){
        CircularArray circularArray = new CircularArray(5);
        circularArray.set(0,"a");
        circularArray.set(1,"b");
        circularArray.set(2,"c");
        circularArray.set(3,"d");
        circularArray.set(4,"e");
        circularArray.set(5,"f");
        circularArray.set(6,"g");
        circularArray.shiftRight(2);
        assertEquals("c",circularArray.get(0));
    }

}