package main.Questions.IDSome;

public class FourDifference {
    public int find(int length) {
        int count = 0;
        for (int i = 1; i <= 9; i++) {
            count += generateNumber(length, 0, i, 0, 0);
        }
        return count;
    }

    private int generateNumber(int length, int index, int currentNumber, int nextNumber, int count) {
        if (length == index + 1 || nextNumber < 0 || nextNumber > 9) return count;

        if (isNextBiggerByFour(currentNumber, nextNumber) || iSNextSmallerByFour(currentNumber, nextNumber)) {
            if (length == index + 2) count += 1;
            count = generateNumber(length, index + 1, nextNumber, 0, count);
        }
        return generateNumber(length, index, currentNumber, nextNumber + 1, count);
    }


    private boolean isNextBiggerByFour(int currentDigit, int nextDigit) {
        return (nextDigit - currentDigit >= 4);
    }

    private boolean iSNextSmallerByFour(int currentDigit, int nextDigit) {
        return (currentDigit - nextDigit >= 4);
    }
}
