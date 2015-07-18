package main.ConceptsAndAlgorithms.BitManipulation.Three.Lib;

public class Utils {
    public static int update(int number, int i) {
        number = clear(number, i);
        return set(number, i);
    }

    public static boolean get(int number, int i) {
        return ((number & (1<<(i-1)))!=0);
    }

    public static int set(int number, int i) {
        return number | (1<<(i-1));
    }

    public static int clear(int number, int i) {
        return number& (~(1<<(i-1)));
    }

    public static int clearRightSide(int number, int i) {
        return number & (~((1<<(i))-1));
    }
}
