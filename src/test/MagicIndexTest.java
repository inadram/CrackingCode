package test;

import main.ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Three.MagicIndex;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MagicIndexTest {

    @Test
    public void find_expected_magic_index(){

        int[] sortedArray = new int[]{10,20,30,40,4,60,70};
        MagicIndex magicIndex = new MagicIndex();
        assertEquals(4, magicIndex.find(sortedArray,0));
    }

    @Test
    public void find_not_exist_magic_index(){

        int[] sortedArray = new int[]{10,20,30,40,45,60,70};
        MagicIndex magicIndex = new MagicIndex();
        assertEquals(-1, magicIndex.find(sortedArray,0));
    }

}