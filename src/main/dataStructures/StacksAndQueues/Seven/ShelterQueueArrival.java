package main.dataStructures.StacksAndQueues.Seven;


import main.dataStructures.StacksAndQueues.Seven.Lib.AbstractAnimal;
import main.dataStructures.StacksAndQueues.Seven.Lib.Dog;

import java.util.LinkedList;

public class ShelterQueueArrival {
    private LinkedList<AbstractAnimal> dogs = new LinkedList<AbstractAnimal>();
    private LinkedList<AbstractAnimal> cats = new LinkedList<AbstractAnimal>();

    public AbstractAnimal deQueueDog() {
        return dogs.poll();
    }

    public AbstractAnimal deQueueCat() {
       return cats.poll();
    }

    public AbstractAnimal deQueueAny() {
        if (dogs.peek().getOrder() < cats.peek().getOrder()) return deQueueDog();
        else return deQueueCat();
    }

    int order = 0;

    public void enqueue(AbstractAnimal animal) {
        order += 1;
        animal.setOrder(order);
        if (animal instanceof Dog) dogs.add(animal);
        else cats.add(animal);
    }
}
