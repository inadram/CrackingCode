package main.dataStructures.StacksAndQueues.Seven.Lib;

public abstract class AbstractAnimal {
    public String name;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    int order;
    public AbstractAnimal(String name){
        this.name = name;
    }


}
