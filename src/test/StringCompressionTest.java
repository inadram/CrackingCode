package test;

import main.dataStructures.arraysAndStrings.Five.StringCompression;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StringCompressionTest {

    @Test
    public void test_compress_aaa_string_to_a3()
    {
        StringCompression stringCompression =new StringCompression();
        String actualString= stringCompression.compress("aaa");
        assertEquals(actualString,"a3");
    }

    @Test
    public void test_compress_aaabbacc_string_to_a4b2c2()
    {
        StringCompression stringCompression =new StringCompression();
        String actualString= stringCompression.compress("aaabbacc");
        assertEquals(actualString,"a4b2c2");
    }

    @Test
    public void test_compress_aaassddfgghh_string_return_itself_if_compressed_version_is_not_smaller()
    {
        StringCompression stringCompression =new StringCompression();
        String actualString= stringCompression.compress("aaassddfgghh");
        assertEquals(actualString,"aaassddfgghh");
    }

    @Test
    public void test_compress_aaaabbcc_string_to_a4b2c2_with_string()
    {
        StringCompression stringCompression =new StringCompression();
        String actualString= stringCompression.compressWithString("aaaabbcc");
        assertEquals(actualString,"a4b2c2");
    }

    @Test
    public void test_compress_aaassddfgghh_with_string_return_itself_if_compressed_version_is_not_smaller()
    {
        StringCompression stringCompression =new StringCompression();
        String actualString= stringCompression.compressWithString("aaassddfgghh");
        assertEquals(actualString,"aaassddfgghh");
    }

    @Test
    public void test_compress_aaaabbcc_stringBuilder_to_a4b2c2_with_string()
    {
        StringCompression stringCompression =new StringCompression();
        String actualString= stringCompression.compressWithStringBuilder("aaaabbcc");
        assertEquals(actualString,"a4b2c2");
    }

    @Test
    public void test_compress_aaassddfgghh_with_stringBuilder_return_itself_if_compressed_version_is_not_smaller()
    {
        StringCompression stringCompression =new StringCompression();
        String actualString= stringCompression.compressWithStringBuilder("aaassddfgghh");
        assertEquals(actualString,"aaassddfgghh");
    }


    @Test
    public void test_compress_aaaabbcc_charArray_to_a4b2c2_with_string()
    {
        StringCompression stringCompression =new StringCompression();
        String actualString= stringCompression.compressWithCharArray("aaaabbcc");
        assertEquals(actualString,"a4b2c2");
    }

    @Test
    public void test_compress_aaassddfgghh_with_charArray_return_itself_if_compressed_version_is_not_smaller()
    {
        StringCompression stringCompression =new StringCompression();
        String actualString= stringCompression.compressWithCharArray("aaassddfgghh");
        assertEquals(actualString,"aaassddfgghh");
    }

}
