import  dataStructures.StacksAndQueues.Two.StackWithNodeMin;
import org.junit.Assert;
import org.junit.Test;

public class StackWithNodeMinTest {

    @Test
    public void test_get_min_from_StackWithNodeMin(){
        StackWithNodeMin stack =new StackWithNodeMin();
        stack.push(10);
        stack.push(20);
        stack.push(15);
        stack.push(7);
        stack.push(9);

        Assert.assertEquals(7, stack.min());
    }

    @Test
    public void test_get_min_from_StackWithNodeMin_after_pop(){
        StackWithNodeMin stack =new StackWithNodeMin();
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