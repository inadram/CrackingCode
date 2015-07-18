package main.ConceptsAndAlgorithms.BitManipulation.Three.Lib;

public class HowManyOnes {
    public static int get(int number) {
        int ones=1;
        while (number>1) {
            if (number % 2 != 0) {
                ones++;
            }
            number = number / 2;
        }
        return ones;
    }
}
