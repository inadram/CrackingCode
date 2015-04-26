package test;

import main.dataStructures.StacksAndQueues.One.ArrayToStack;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ArrayToStackTest {

    @Test
    public void single_array_to_push_three_stack(){

        ArrayToStack arrayToStack = new ArrayToStack();
        arrayToStack.push(1);
        arrayToStack.push(2);
        arrayToStack.push(3);
        arrayToStack.push(4);

        assertEquals(4,arrayToStack.peek());
    }

    @Test
    public void single_array_to_pop_from_three_stack(){

        ArrayToStack arrayToStack = new ArrayToStack();
        arrayToStack.push(1);
        arrayToStack.push(2);
        arrayToStack.push(3);
        arrayToStack.push(4);

        assertEquals(4, arrayToStack.pop());
        assertEquals(3, arrayToStack.pop());
        assertEquals(2, arrayToStack.pop());
        assertEquals(1, arrayToStack.pop());
        assertTrue(arrayToStack.isEmpty());
    }
}