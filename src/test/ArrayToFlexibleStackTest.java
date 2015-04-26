package test;

import junit.framework.TestCase;
import main.dataStructures.StacksAndQueues.One.ArrayToFlexibleStack;
import org.testng.annotations.Test;

public class ArrayToFlexibleStackTest extends TestCase {


    @Test
    public void single_array_to_push_three_stack() throws Exception {

        ArrayToFlexibleStack arrayToStack = new ArrayToFlexibleStack();
        arrayToStack.push(0,10);
        arrayToStack.push(1,20);
        arrayToStack.push(2,30);
        arrayToStack.push(2,10);
        arrayToStack.push(2,15);

        assertEquals(15,arrayToStack.peek(2));
    }

    @Test
    public void single_array_to_pop_from_three_stack() throws Exception {

        ArrayToFlexibleStack arrayToStack = new ArrayToFlexibleStack();
        arrayToStack.push(0,10);
        arrayToStack.push(1,20);
        arrayToStack.push(0,30);
        arrayToStack.push(2,10);
        arrayToStack.push(2, 15);

        assertEquals(20, arrayToStack.pop(1));
        assertEquals(15,arrayToStack.pop(2));
        assertEquals(10,arrayToStack.pop(2));
        assertTrue(arrayToStack.isEmpty(2));
    }

}