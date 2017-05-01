import  dataStructures.StacksAndQueues.Seven.Lib.Animal;
import  dataStructures.StacksAndQueues.Seven.ShelterQueue;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShelterQueueTest {

    @Test
    public void test_give_expected_animal_from_shelter(){
        ShelterQueue shelterQueue = new ShelterQueue();

        shelterQueue.enqueue(new Animal("dog", 10));
        shelterQueue.enqueue(new Animal("cat", 5));
        shelterQueue.enqueue(new Animal("cat", 25));
        shelterQueue.enqueue(new Animal("dog", 7));
        shelterQueue.enqueue(new Animal("dog", 19));
        shelterQueue.enqueue(new Animal("dog", 4));
        shelterQueue.enqueue(new Animal("cat", 2));

        Animal animal = shelterQueue.deQueueDog();
        assertEquals(19, animal.age);
        assertEquals("dog", animal.type);

        animal = shelterQueue.deQueueCat();
        assertEquals(25, animal.age);
        assertEquals("cat", animal.type);

        animal = shelterQueue.deQueueDog();
        assertEquals(10, animal.age);
        assertEquals("dog", animal.type);

        animal = shelterQueue.deQueueAny();
        assertEquals(7, animal.age);
        assertEquals("dog", animal.type);
    }

}