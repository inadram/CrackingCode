package main.dataStructures.StacksAndQueues.One;

public class ArrayToStack {
    int[] first=new int[5];
    int[] second=new int[5];
    int[] third=new int[5];
    int position =-1;
    int[][] array = {first,second,third};

    public void push(int value) {
        position++;
        array[getColumn()][getRow()] = value;
    }

    public int pop(){
        int popValue=  array[getColumn()][getRow()];
        position --;
        return popValue;
    }

    private int getColumnAt(int positionAt) {
        return (int) Math.floor(positionAt / 5);
    }


    private int getRow() {
        return position%5;
    }

    private int getColumn() {
        return (int) Math.floor(position/5);
    }

    public int peek() {
        return  array[getColumn()][getRow()];
    }

    public boolean isEmpty() {
        return position==-1;
    }

    public int popAt(int stackId) {
        int positionAt = getPositionAt(stackId);
        int popAtValue = array[getColumnAt(positionAt)][getRowAt(positionAt)];
        for (int i = positionAt; i <= position; i++) {
            array[getColumnAt(i)][getRowAt(i)] = array[getColumnAt(i + 1)][getRowAt(i + 1)];
        }
        position--;
        return popAtValue;

    }

    private int getPositionAt(int stackId) {
        return (stackId * 5 - 1 > position) ? position : stackId * 5 - 1;
    }

    private int getRowAt(int positionAt) {
        return positionAt % 5;
    }
}
