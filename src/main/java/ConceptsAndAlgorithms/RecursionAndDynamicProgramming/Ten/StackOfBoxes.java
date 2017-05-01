package ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Ten;

public class StackOfBoxes {
    public int totalHeight;

    public void build(TheBox[] theBoxStack, TheBox currentBox,int index, int[] heights) {
        for (int i = index; i < theBoxStack.length; i++) {
            TheBox nextBox = theBoxStack[i];
            if (isValid(currentBox, nextBox)) {
                heights[index] = theBoxStack[i].height;
                build(theBoxStack, nextBox,index+1, heights);
            }
        }
        clear(index,heights);
        setTotalHeight(heights);
    }

    private void clear(int start,int[] array){
        for(int i=start;i<array.length;i++){
            array[i]=0;
        }
    }
    private boolean isValid(TheBox currentBox, TheBox nextBox) {
        return nextBox.height < currentBox.height && nextBox.width < currentBox.width && nextBox.depth < currentBox.depth;
    }

    public void setTotalHeight(int[] heights) {
        int sum =0;
        for(int height:heights){
           sum+=height;
        }
        totalHeight= Math.max(totalHeight,sum);
    }
}
