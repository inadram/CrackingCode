import junit.framework.TestCase;
import  dataStructures.StacksAndQueues.Lib.Stack;
import org.junit.Test;

public class StackTest extends TestCase {

    @Test
    public void test_push_to_stack_add_item_to_head(){
       Stack stack =new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.peek());
    }

    @Test
    public void test_pop_from_stack_return_item_from_head(){
        Stack queue =new Stack();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        assertEquals(3, queue.pop());
        assertEquals(2, queue.pop());
    }

}