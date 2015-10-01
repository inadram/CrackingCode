package main.KnowledgeBase.Six;

public  class CircularArray<T> {
    int head =0;
    T[] items ;
    public CircularArray(int length) {
        items = (T[]) new Object[length];
    }

    public int getIndex(int requestedIndex){
        return requestedIndex%items.length;
    }
    public void set(int index, T value) {
          items[getIndex(index)] = value;

    }

    public T get(int index) {
        return items[getIndex(index)];
    }
}
