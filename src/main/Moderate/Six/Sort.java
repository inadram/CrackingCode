package main.Moderate.Six;

public class Sort {
    public int[] exec(int[] unOrder) {
        int smallestUnOrder = findSmallestUnOder(unOrder);
        int m = findMPosition(unOrder, smallestUnOrder);

        int biggestUnOrder = findBiggestUnOrder(unOrder);
        int n = findNPosition(unOrder, biggestUnOrder);
        return new int[]{m, n};
    }

    private int findNPosition(int[] unOrder, int biggestUnOrder) {
        int position = 0;
        for (int i = unOrder.length - 1; i > 1; i--) {
            if (unOrder[i] < biggestUnOrder) {
                position = i;
                break;
            }
        }
        return position;
    }

    private int findBiggestUnOrder(int[] unOrder) {
        int biggest = Integer.MIN_VALUE;
        for (int i = unOrder.length - 1; i > 1; i--) {
            if (unOrder[i] < unOrder[i - 1] && biggest < unOrder[i - 1]) {
                biggest = unOrder[i - 1];
            }
        }
        return biggest;
    }

    private int findMPosition(int[] unOrder, int smallestUnOrder) {
        int position = 0;
        for (int i = 0; i < unOrder.length; i++) {
            if (unOrder[i] > smallestUnOrder) {
                position = i;
                break;
            }
        }
        return position;
    }

    private int findSmallestUnOder(int[] unOrder) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < unOrder.length - 1; i++) {
            if (unOrder[i + 1] < unOrder[i] && smallest > unOrder[i + 1]) {
                smallest = unOrder[i + 1];
            }
        }
        return smallest;
    }
}
