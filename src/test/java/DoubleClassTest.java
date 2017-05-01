import  KnowledgeBase.Five.DoubleClass;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class DoubleClassTest {

    @Test
    public void test_reflection() throws Exception {

        Class reflectedDoubleClass = Class.forName("KnowledgeBase.Five.DoubleClass");
        Constructor reflectedConstructor = reflectedDoubleClass.getConstructor(new Class[]{double.class, double.class});
        DoubleClass doubleClassInstance = (DoubleClass) reflectedConstructor.newInstance(new Object[]{4, 3});
        Method reflectedMethod = reflectedDoubleClass.getDeclaredMethod("sum");
        Double actualSum = (Double) reflectedMethod.invoke(doubleClassInstance);

        DoubleClass doubleClass = new DoubleClass(4, 3);
        Double expectdSum = doubleClass.sum();

        assertEquals(expectdSum, actualSum);
    }
}