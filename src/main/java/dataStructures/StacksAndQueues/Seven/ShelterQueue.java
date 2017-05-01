package dataStructures.StacksAndQueues.Seven;


import  dataStructures.StacksAndQueues.Seven.Lib.Animal;

import java.util.LinkedList;

public class ShelterQueue {
    private LinkedList<Animal> animals= new LinkedList<Animal>();

    public Animal deQueueDog() {
        int oldest =Integer.MIN_VALUE;
        int id=-1;
       for(int i =0 ; i<animals.size();i++){
           if(animals.get(i).type.equals("dog") && animals.get(i).age>oldest) {oldest =animals.get(i).age; id=i;}
       }
        return animals.remove(id);
    }

    public Animal deQueueCat() {
        int oldest =Integer.MIN_VALUE;
        int id=-1;
        for(int i =0 ; i<animals.size();i++){
            if(animals.get(i).type.equals("cat") && animals.get(i).age>oldest) {oldest =animals.get(i).age; id=i;}
        }
        return animals.remove(id);
    }
    public Animal deQueueAny() {
        int oldest =Integer.MIN_VALUE;
        int id=-1;
        for(int i =0 ; i<animals.size();i++){
            if(animals.get(i).age>oldest){oldest =animals.get(i).age; id=i;}
        }
        return animals.remove(id);
    }

    public void enqueue(Animal animal) {
        animals.add(animal);
    }
}
