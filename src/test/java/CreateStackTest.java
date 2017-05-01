import ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Ten.CreateStack;
import ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Ten.TheBox;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CreateStackTest {

	@Test
	public void test_height_of_max_boxes_is_equals_to_height_of_stack() {
		CreateStack stackOfBoxes = new CreateStack();
		TheBox b1 = new TheBox(40, 40, 40);
		TheBox b2 = new TheBox(30, 30, 30);
		TheBox b3 = new TheBox(25, 32, 19);
		TheBox b4 = new TheBox(27, 35, 22);
		TheBox b5 = new TheBox(26, 34, 21);
		TheBox b6 = new TheBox(24, 31, 18);
		TheBox[] theBoxes = new TheBox[]{b1, b2, b3, b4, b5, b6};
		ArrayList<TheBox> maxStacks = stackOfBoxes.createStackR(theBoxes, null);

		assertEquals(142, stackOfBoxes.stackHeight(maxStacks));
	}

}