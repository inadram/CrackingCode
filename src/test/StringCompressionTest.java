package test;

import main.dataStructures.ArraysAndStrings.Five.StringCompression;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCompressionTest {

    @Test
    public void test_compress_aaaabbcc_string_to_a4b2c2_with_string()
    {
        StringCompression stringCompression =new StringCompression();
        String actualString= stringCompression.compress("aaaabbcc");
        assertEquals(actualString,"a4b2c2");
    }

    @Test
    public void test_compress_aaassddfgghh_with_string_return_itself_if_compressed_version_is_not_smaller()
    {
        StringCompression stringCompression =new StringCompression();
        String actualString= stringCompression.compress("aaassddfgghh");
        assertEquals(actualString,"aaassddfgghh");
    }




}
