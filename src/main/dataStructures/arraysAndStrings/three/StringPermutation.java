package main.dataStructures.arraysAndStrings.three;

public class StringPermutation {
    public boolean check(String permutationOne, String permutationTwo) {
        if(permutationOne.length()!=permutationTwo.length()){
            return false;
        }
        int lengthIndex = permutationOne.length()-1;
        for(int i=0;i<= lengthIndex;i++){
            if(permutationOne.charAt(i)!=permutationTwo.charAt(lengthIndex-i)){
               return false;
            }
        }
        return true;
    }
}
