import Questions.ID6304195600711680.DeepCopy;
import Questions.ID6304195600711680.SomeRandomObject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeepCopyTest {

	@Test
	public void test_deep_copy_object() {

		DeepCopy deepCopy = new DeepCopy();
		SomeRandomObject actual = deepCopy.exec(new SomeRandomObject(10, "str"));
		assertEquals(actual.someInt, 10);
		assertEquals(actual.someString, "str");
	}
}