import junit.framework.TestCase;
import  dataStructures.StacksAndQueues.Lib.Queue;
import org.junit.Test;

public class QueueTest extends TestCase {

    @Test
    public void test_push_to_queue_add_item_to_tail(){
       Queue queue =new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        assertEquals(1, queue.peek());
    }

    @Test
    public void test_dequeue_from_queue_return_item_from_head(){
        Queue queue =new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        assertEquals(1, queue.deQueue());
        assertEquals(2, queue.deQueue());
    }

}