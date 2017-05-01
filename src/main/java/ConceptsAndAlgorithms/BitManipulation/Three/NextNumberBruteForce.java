package ConceptsAndAlgorithms.BitManipulation.Three;

import ConceptsAndAlgorithms.BitManipulation.Lib.HowManyOnes;

public class NextNumberBruteForce {
    public int getBigger(int number) {
       int ones= HowManyOnes.get(number);
        int nextNumber = number+1;
        while (HowManyOnes.get(nextNumber)!=ones){
            nextNumber++;
        }
        return nextNumber;
    }



    public int getSmaller(int number) {
        int ones= HowManyOnes.get(number);
        int previousNumber = number-1;
        while (HowManyOnes.get(previousNumber)!=ones){
            previousNumber--;
        }
        return previousNumber;
    }
}
