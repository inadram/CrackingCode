package dataStructures.StacksAndQueues.Three;


import  dataStructures.StacksAndQueues.Lib.DoublyStack;

import java.util.ArrayList;

public class SetOfCustomisedStacksRecursivelyWithArrayList extends SetOfStacksWithArrayList {

    ArrayList<DoublyStack> setOfStacks = new ArrayList<DoublyStack>();
    private int limit;

    public SetOfCustomisedStacksRecursivelyWithArrayList(int limit) {
        super(limit);
        this.limit = limit;
    }
    public void push(int i) {
        if (setOfStacks.isEmpty() || isStackFull(getLastStackArray(setOfStacks))) {
            setOfStacks.add(new DoublyStack());
        }
        getLastStackArray(setOfStacks).push(i);
    }

    public int popAt(int index) {
        return leftShift(index, true);
    }

    private int leftShift(int index, boolean removeTop) {
        DoublyStack stack = setOfStacks.get(index);
        int removeItem = (removeTop)? stack.pop():stack.popBottom();
        if(stack.isEmpty()){
            setOfStacks.remove(index);
        }
        if(setOfStacks.size()-1 > index){
            int v = leftShift(++index, false);
            stack.push(v);
        }
        return removeItem;

    }

    DoublyStack getLastStackArray(ArrayList<DoublyStack> setOfStacks) {
        return setOfStacks.get(setOfStacks.size()-1);
    }

    boolean isStackFull(DoublyStack stack) {
        return stack.size() >= limit;
    }

}
