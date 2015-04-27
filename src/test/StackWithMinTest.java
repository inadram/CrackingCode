package test;

import main.dataStructures.StacksAndQueues.Two.StackWithMin;
import org.junit.Assert;
import org.junit.Test;

public class StackWithMinTest {

    @Test
    public void test_get_min_from_stack(){
        StackWithMin stack =new StackWithMin();
        stack.push(10);
        stack.push(20);
        stack.push(15);
        stack.push(7);
        stack.push(9);

        Assert.assertEquals(7, stack.min());
    }

    @Test
    public void test_get_min_from_stack_after_pop(){
        StackWithMin stack =new StackWithMin();
        stack.push(10);
        stack.push(20);
        stack.push(15);
        stack.push(7);
        stack.push(9);
        stack.pop();
        stack.pop();

        Assert.assertEquals(10, stack.min());
    }
}