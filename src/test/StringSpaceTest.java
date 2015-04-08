package test;

import main.dataStructures.arraysAndStrings.Four.StringSpace;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StringSpaceTest {

    @Test
    public void test_all_spaces_replace_with_20Percent(){
        StringSpace stringSpace=new StringSpace();
        char[] actualString= stringSpace.replaceWith20Percent("some string to re place ".toCharArray());
        char[] expectedString= "some%20string%20to%20re%20place%20".toCharArray();

        assertEquals(new String(actualString),new String(expectedString));
    }
}
