package test;

import main.ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Three.MagicIndexNoneDistinct;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MagicIndexNoneDistinctTest  {
    @Test
    public void find_expected_magic_index(){
        int[] sortedArray = new int[]{1,2,2,2,50,60,70};
        MagicIndexNoneDistinct magicIndex = new MagicIndexNoneDistinct();
        assertEquals(2, magicIndex.find(sortedArray,0,sortedArray.length-1));
    }

    @Test
    public void find_not_exist_magic_index(){
        int[] sortedArray = new int[]{1,2,4,5,5,5,5,5,5,5,6,7};
        MagicIndexNoneDistinct magicIndex = new MagicIndexNoneDistinct();
        assertEquals(5, magicIndex.find(sortedArray,0,sortedArray.length-1));
    }

}