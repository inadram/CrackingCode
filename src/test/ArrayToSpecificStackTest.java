package test;

import junit.framework.TestCase;
import main.dataStructures.StacksAndQueues.One.ArrayToSpecificStack;
import main.dataStructures.StacksAndQueues.One.ArrayToStack;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ArrayToSpecificStackTest {

    @Test
    public void single_array_to_push_three_stack() throws Exception {

        ArrayToSpecificStack arrayToStack = new ArrayToSpecificStack();
        arrayToStack.push(1,1);
        arrayToStack.push(2,2);
        arrayToStack.push(3,3);
        arrayToStack.push(4,1);

        assertEquals(4,arrayToStack.peek(1));
    }

    @Test
    public void single_array_to_pop_from_three_stack() throws Exception {

        ArrayToSpecificStack arrayToStack = new ArrayToSpecificStack();
        arrayToStack.push(1,1);
        arrayToStack.push(2,2);
        arrayToStack.push(3,2);
        arrayToStack.push(4,2);

        assertEquals(4, arrayToStack.pop(2));
        assertEquals(3,arrayToStack.pop(2));
        assertEquals(2,arrayToStack.pop(2));
        assertTrue(arrayToStack.isEmpty(2));
    }

}