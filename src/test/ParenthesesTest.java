package test;

import main.ConceptsAndAlgorothms.RecursionAndDynamicProgramming.Six.Parentheses;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParenthesesTest {

    @Test
    public void test_two_parentheses(){
        Parentheses parentheses=new Parentheses();
        HashSet<String> actual =parentheses.getAll(2);
        HashSet<String> expected = new HashSet<String>();
        expected.add("()()");
        expected.add("(())");
        for(String str :expected){
            assertTrue(actual.contains(str));
        }
        assertEquals(expected.size(),actual.size());
    }

    @Test
    public void test_three_parentheses(){
        Parentheses parentheses=new Parentheses();
        HashSet<String> actual =parentheses.getAll(3);
        HashSet<String> expected = new HashSet<String>();
        expected.add("()()()");
        expected.add("(())()");
        expected.add("()(())");
        expected.add("(()())");
        expected.add("((()))");
        for(String str :expected){
            assertTrue(actual.contains(str));
        }
        assertEquals(expected.size(),actual.size());
    }
}