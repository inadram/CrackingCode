import  Questions.ID5665972218232832.RelativePath;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RelativePathTest {

    @Test
    public void normalise_a_path(){
        RelativePath relativePath=new RelativePath();

        assertEquals("\\a\\foo.txt",relativePath.normalise("\\a\\b\\..\\foo.txt"));
        assertEquals("\\foo.txt",relativePath.normalise("\\a\\b\\..\\..\\foo.txt"));
        assertEquals("\\a\\foo.txt",relativePath.normalise("\\a\\b\\c\\..\\..\\foo.txt"));
        assertEquals("\\a\\d\\foo.txt",relativePath.normalise("\\a\\b\\c\\..\\..\\d\\foo.txt"));
        assertEquals("\\a\\d\\foo.txt",relativePath.normalise("\\a\\b\\c\\..\\..\\d\\.\\foo.txt"));
    }

}