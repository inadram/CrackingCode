import  dataStructures.StacksAndQueues.Seven.Lib.AbstractAnimal;
import  dataStructures.StacksAndQueues.Seven.Lib.Cat;
import  dataStructures.StacksAndQueues.Seven.Lib.Dog;
import  dataStructures.StacksAndQueues.Seven.ShelterQueueArrival;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShelterQueueArrivalTest {

    @Test
    public void test_give_expected_animal_from_shelter(){
        ShelterQueueArrival shelterQueue = new ShelterQueueArrival();

        shelterQueue.enqueue(new Cat("cat one"));
        shelterQueue.enqueue(new Dog("dog three"));
        shelterQueue.enqueue(new Cat("cat two"));
        shelterQueue.enqueue(new Dog("dog one"));
        shelterQueue.enqueue(new Dog("dog two"));

        AbstractAnimal animal = shelterQueue.deQueueDog();
        assertEquals("dog three", animal.name);

        animal = shelterQueue.deQueueCat();
        assertEquals("cat one", animal.name);

        animal = shelterQueue.deQueueDog();
        assertEquals("dog one", animal.name);

        animal = shelterQueue.deQueueAny();
        assertEquals("cat two", animal.name);
    }

}