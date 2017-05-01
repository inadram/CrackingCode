import dataStructures.ArraysAndStrings.Five.SetCharCompression;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetCharCompressionTest {

	@Test
	public void test_compress_aaaabbcc_charArray_to_a4b2c2_with_string() {
		SetCharCompression setCharCompression = new SetCharCompression();
		String actualString = setCharCompression.compress(("aaaabbcc"));
		assertEquals(actualString, "a4b2c2");
	}

	@Test
	public void test_compress_aaassddfgghh_with_charArray_return_itself_if_compressed_version_is_not_smaller() {
		SetCharCompression setCharCompression = new SetCharCompression();
		String actualString = setCharCompression.compress("aaassddfgghh");
		assertEquals(actualString, "aaassddfgghh");
	}
}
