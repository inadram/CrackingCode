import  dataStructures.StacksAndQueues.Five.MyQueue;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyQueueTest{

    @Test
    public void test_add_value_to_myQueue(){
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(100);
        myQueue.enQueue(110);
        myQueue.enQueue(120);

        assertEquals(myQueue.peek(), 100);
        assertEquals(myQueue.deQueue(),100);
        assertEquals(myQueue.deQueue(),110);
        myQueue.enQueue(150);
        assertEquals(myQueue.deQueue(),120);
        assertEquals(myQueue.deQueue(),150);


    }

}