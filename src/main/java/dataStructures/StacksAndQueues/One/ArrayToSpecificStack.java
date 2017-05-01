package dataStructures.StacksAndQueues.One;

public class ArrayToSpecificStack {

	int stackSize = 5;
	int[] bufferSize = new int[3 * stackSize];
	int[] stackPosition = {-1, -1, -1};

	public void push(int value, int stackId) throws Exception {
		if (stackPosition[getStackIndex(stackId)] > stackSize) {
			throw new Exception("out of boundary stack id");
		}
		stackPosition[getStackIndex(stackId)]++;
		bufferSize[getPosition(stackId)] = value;
	}

	public int pop(int stackId) throws Exception {
		if (stackPosition[getStackIndex(stackId)] == -1) {
			throw new Exception("the stack is empty");
		}
		int value = bufferSize[getPosition(stackId)];
		bufferSize[getPosition(stackId)] = 0;
		stackPosition[getStackIndex(stackId)]--;
		return value;
	}

	public int peek(int stackId) {
		return bufferSize[getPosition(stackId)];
	}

	public boolean isEmpty(int stackId) {
		return stackPosition[getStackIndex(stackId)] == -1;
	}

	private int getStackIndex(int stackId) {
		return stackId - 1;
	}


	private int getPosition(int stackId) {
		return (getStackIndex(stackId)) * stackSize + stackPosition[getStackIndex(stackId)];
	}
}
