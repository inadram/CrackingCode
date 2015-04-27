package test;

import main.dataStructures.ArraysAndStrings.Five.StringBuilderCompression;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StringBuilderCompressionTest {

    @Test
    public void test_compress_aaaabbcc_stringBuilder_to_a4b2c2_with_string()
    {
        StringBuilderCompression stringBuilderCompression =new StringBuilderCompression();
        String actualString= stringBuilderCompression.compress("aaaabbcc");
        assertEquals(actualString,"a4b2c2");
    }

    @Test
    public void test_compress_aaassddfgghh_with_stringBuilder_return_itself_if_compressed_version_is_not_smaller()
    {
        StringBuilderCompression stringBuilderCompression =new StringBuilderCompression();
        String actualString= stringBuilderCompression.compress("aaassddfgghh");
        assertEquals(actualString,"aaassddfgghh");
    }
}
