package test;

import main.Questions.ID6304195600711680.DeepCopy;
import main.Questions.ID6304195600711680.SomeRandomObject;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class DeepCopyTest{

    @Test
    public void test_deep_copy_object() throws IOException, ClassNotFoundException {

       DeepCopy deepCopy = new DeepCopy();
       SomeRandomObject actual= deepCopy.exec(new SomeRandomObject(10,"str"));
        assertEquals(actual.someInt,10);
        assertEquals(actual.someString,"str");
    }

}

