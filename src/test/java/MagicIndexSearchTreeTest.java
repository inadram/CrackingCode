import ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Three.MagicIndexSearchTree;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MagicIndexSearchTreeTest {
	@Test
	public void find_expected_magic_index() {

		int[] sortedArray = new int[]{-10, 5, 0, 2, 4, 60, 70};
		MagicIndexSearchTree magicIndex = new MagicIndexSearchTree();
		assertEquals(4, magicIndex.find(sortedArray, 0, sortedArray.length));
	}

	@Test
	public void find_not_exist_magic_index() {

		int[] sortedArray = new int[]{10, 20, 30, 40, 45, 60, 70};
		MagicIndexSearchTree magicIndex = new MagicIndexSearchTree();
		assertEquals(-1, magicIndex.find(sortedArray, 0, sortedArray.length));
	}

}