package main.ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Three;

public class MagicIndexNoneDistinct {

    public int find(int[] sortedArray, int start, int end) {

        if(start<0 || end>= sortedArray.length || end<start){
            return -1;
        }
        int middleIndex = (start + end) >>> 1;
        int middleValue = sortedArray[middleIndex];

        if(middleIndex==middleValue){
            return middleValue;
        }

        int leftIndex  = Math.min(middleIndex-1,middleValue);
        int left = find(sortedArray, start, leftIndex);
        if(left>0){
           return left;
        }
        int rightIndex = Math.max(middleIndex+1,middleValue);
        int right = find(sortedArray,rightIndex,end);
        return right;

    }
}
