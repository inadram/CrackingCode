package test;

import main.Moderate.Fourteen.UnConcatenating;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class UnConcatenatingTest {

    @Test
    public void test_unconcatenating(){
        HashSet<String> words = new HashSet<String>();
        words.add("looked");
        words.add("just");
        words.add("like");
        words.add("her");
        words.add("brother");
        UnConcatenating unConcatenating = new UnConcatenating(words);
        String actual = unConcatenating.exec("jesslookedjustliketimherbrother");
        assertEquals("JESS looked just like TIM her brother", actual);
    }

}