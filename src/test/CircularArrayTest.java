package test;

import main.KnowledgeBase.Six.CircularArray;
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



}