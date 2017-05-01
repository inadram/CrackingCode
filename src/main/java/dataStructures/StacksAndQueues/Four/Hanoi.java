package dataStructures.StacksAndQueues.Four;

import java.util.Stack;

public class Hanoi {
    public Stack[] stacks;
    private int numberOfDisks;

    public Hanoi(int numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
        stacks = new Stack[]{new Stack<Integer>(), new Stack<Integer>(), new Stack<Integer>()};
        for (int i = numberOfDisks; i > 0; i--) {
            stacks[0].push(i * 10);
        }
    }

    public void move() {
        moveRec(numberOfDisks - 1, stacks[0], stacks[1], stacks[2]);
    }

    private void moveRec(int disks, Stack<Integer> source, Stack<Integer> buffer, Stack<Integer> destination) {
        if (disks == 0) {
            destination.push(source.pop());
        } else {
            // move source to buffer
            moveRec(disks - 1, source, destination, buffer);
            //move source to destination
            destination.push(source.pop());
            //move buffer to destination
            moveRec(disks - 1, buffer, source, destination);
        }
    }

}
