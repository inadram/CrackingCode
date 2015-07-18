package main.ConceptsAndAlgorithms.BitManipulation.Three.Lib;

public class HowManyOnes {
    public static int get(int number) {
        int ones=0;
        while (number!=0) {
           number = number&(number-1);
            ones++;
        }
        return ones;
    }
}
