package test;

import main.dataStructures.ArraysAndStrings.Four.StringSpace;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringSpaceTest {

    @Test
    public void test_all_spaces_replace_with_20Percent(){
        StringSpace stringSpace=new StringSpace();
        char[] actualString= stringSpace.replaceWith20Percent("some string to re place ".toCharArray());
        char[] expectedString= "some%20string%20to%20re%20place%20".toCharArray();

        assertEquals(new String(actualString),new String(expectedString));
    }

    @Test
    public void test_all_spaces_replace_with_20PercentInPlace(){
        StringSpace stringSpace=new StringSpace();
        char[] someCharArray = new char["some%20string%20to%20re%20place%20".length()];
        char[] original = "some string to re place ".toCharArray();
        int index=0;
        for(char c :original){
            someCharArray[index]=c;
            index++;
        }
        char[] actualString= stringSpace.replaceWith20PercentInPlace(someCharArray,original.length);
        char[] expectedString= "some%20string%20to%20re%20place%20".toCharArray();

        assertEquals(new String(actualString),new String(expectedString));
    }
}
