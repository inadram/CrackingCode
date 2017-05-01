import  dataStructures.ArraysAndStrings.Five.TreeMapCompression;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeMapCompressionTest {
    @Test
    public void test_compress_aaa_string_to_a3()
    {
        TreeMapCompression stringCompression =new TreeMapCompression();
        String actualString= stringCompression.compress("aaa");
        assertEquals(actualString,"a3");
    }

    @Test
    public void test_compress_aaabbacc_string_to_a4b2c2()
    {
        TreeMapCompression stringCompression =new TreeMapCompression();
        String actualString= stringCompression.compress("aaabbacc");
        assertEquals(actualString,"a4b2c2");
    }

    @Test
    public void test_compress_aaassddfgghh_string_return_itself_if_compressed_version_is_not_smaller()
    {
        TreeMapCompression stringCompression =new TreeMapCompression();
        String actualString= stringCompression.compress("aaassddfgghh");
        assertEquals(actualString,"aaassddfgghh");
    }

}
