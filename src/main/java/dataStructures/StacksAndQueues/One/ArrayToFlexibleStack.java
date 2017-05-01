package dataStructures.StacksAndQueues.One;


class StackData {
    public int startIndex;
    public int lastEntryIndex;
    public int numberOfItems = 0;
    public int stackSize;

    public StackData(int startIndex, int stackSize) {
        this.startIndex = startIndex;
        lastEntryIndex = startIndex - 1;
        this.stackSize = stackSize;
    }

    public boolean isWithinStack(int index, int total_size) {
        // if the stack wraps the head (right side) wraps around to the left
        if (startIndex <= index && index < startIndex + stackSize) {
            // non-wrapping, or head (right side) of wrapping case
            return true;
        } else if (startIndex + stackSize > total_size &&
                index < (startIndex + stackSize) % total_size) {
            // tail (left side) of wrapping case
            return true;
        }

        return false;
    }
}

public class ArrayToFlexibleStack {

    int number_of_stacks = 3;
    int default_size = 4;
    int total_size = default_size * number_of_stacks;
    StackData[] stacks = {new StackData(0, default_size),
            new StackData(default_size, default_size),
            new StackData(default_size * 2, default_size)};
    int[] buffer = new int[total_size];


    public int numberOfElements() {
        return stacks[0].numberOfItems + stacks[1].numberOfItems + stacks[2].numberOfItems;
    }

    public int nextElement(int index) {
        if (index + 1 == total_size) return 0;
        else return index + 1;
    }

    public int previousElement(int index) {
        if (index == 0) return total_size - 1;
        else return index - 1;
    }

    public void shift(int stackNum) {
        StackData stack = stacks[stackNum];
        if (stack.numberOfItems >= stack.stackSize) {
            int nextStack = (stackNum + 1) % number_of_stacks;
            shift(nextStack); // makes some room
            stack.stackSize++;
        }

        // shift elements in reverse order
        for (int i = (stack.startIndex + stack.stackSize - 1) % total_size;
             stack.isWithinStack(i, total_size);
             i = previousElement(i)) {
            buffer[i] = buffer[previousElement(i)];
        }

        buffer[stack.startIndex] = 0;
        stack.startIndex = nextElement(stack.startIndex); // move stack startIndex
        stack.lastEntryIndex = nextElement(stack.lastEntryIndex); // move lastEntryIndex
        stack.stackSize--; // return stackSize to original
    }

    // expand stack by shifting over other stacks
    public void expand(int stackNum) {
        shift((stackNum + 1) % number_of_stacks);
        stacks[stackNum].stackSize++;
    }

    public void push(int stackNum, int value) throws Exception {
        StackData stack = stacks[stackNum];
        // check that there is space
        if (stack.numberOfItems >= stack.stackSize) {
            throw new Exception("Out of space.");
        } else { // shift things around
            expand(stackNum);
        }


        // find the index of the top element in the array + 1,
        // and increment the stack lastEntryIndex.
        stack.numberOfItems++;
        stack.lastEntryIndex = nextElement(stack.lastEntryIndex);
        buffer[stack.lastEntryIndex] = value;
    }

    public int pop(int stackNum) throws Exception {
        StackData stack = stacks[stackNum];
        if (stack.numberOfItems == 0) {
            throw new Exception("Trying to deQueue an empty stack.");
        }
        int value = buffer[stack.lastEntryIndex];
        buffer[stack.lastEntryIndex] = 0;
        stack.lastEntryIndex = previousElement(stack.lastEntryIndex);
        stack.numberOfItems--;
        return value;
    }

    public int peek(int stackNum) {
        StackData stack = stacks[stackNum];
        return buffer[stack.lastEntryIndex];
    }

    public boolean isEmpty(int stackNum) {
        StackData stack = stacks[stackNum];
        return stack.numberOfItems == 0;
    }

}
