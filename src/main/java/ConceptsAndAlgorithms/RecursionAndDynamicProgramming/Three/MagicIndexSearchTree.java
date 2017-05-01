package ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Three;

public class MagicIndexSearchTree {

    public int find(int[] sortedArray, int start, int end) {
        if(end-start<=1){
            return -1;
        }
        int middle = (end + start) >>>1;
        if(sortedArray[(middle)]==middle){
            return sortedArray[middle];
        }
        return (sortedArray[middle]>middle)? find(sortedArray,start,middle):find(sortedArray,middle,end);
    }
}
