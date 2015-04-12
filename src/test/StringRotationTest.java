package test;

import main.dataStructures.arraysAndStrings.Eight.StringRotation;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class StringRotationTest {

    @Test
    public void test_if_s1_is_rotation_of_s2(){
        StringRotation stringRotation=new StringRotation();
        String first="waterbottLe";
        String second="erbottLewat";
        assertTrue(stringRotation.check(first, second));
    }

    @Test
    public void test_if_s1_is_rotation_of_s2_with_substring(){
        StringRotation stringRotation=new StringRotation();
        String first="waterbottLe";
        String second="erbottLewat";
        assertTrue(stringRotation.checkWithSubString(first, second));
    }
}
