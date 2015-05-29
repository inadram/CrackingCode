package test;

import main.ConceptsAndAlgorothms.RecursionAndDynamicProgramming.Four.SetOfStrings;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class SetOfStringsTest {
    Set<String> s1;
    Set<String> s2;
    Set<String> s3;
    Set<String> expectedS1;
    Set<String> expectedS2;
    Set<String> expectedS3;
    Set<String> expectedS1S2;
    Set<String> expectedS1S3;
    Set<String> expectedS2S3;
    Set<String> expectedS1S2S3;
    @Before
    public void setUp(){
        s1 =new HashSet<String>();
        s1.add("S1");

        s2 =new HashSet<String>();
        s2.add("S2");

        s3 =new HashSet<String>();
        s3.add("S3");


        expectedS1 =new HashSet<String>();
        expectedS1.add("S1");

        expectedS2 =new HashSet<String>();
        expectedS2.add("S2");

        expectedS3 =new HashSet<String>();
        expectedS3.add("S3");

        expectedS1S2 =new HashSet<String>();
        expectedS1S2.add("S1");
        expectedS1S2.add("S2");

        expectedS1S3 =new HashSet<String>();
        expectedS1S3.add("S1");
        expectedS1S3.add("S3");

        expectedS2S3 =new HashSet<String>();
        expectedS2S3.add("S2");
        expectedS2S3.add("S3");

        expectedS1S2S3 =new HashSet<String>();
        expectedS1S2S3.add("S1");
        expectedS1S2S3.add("S2");
        expectedS1S2S3.add("S3");
    }

    @Test
    public void test_subset_of_one(){
        SetOfStrings set = new SetOfStrings();
        ArrayList<Set<String>> list = new ArrayList<Set<String>>();

        list.add(s1);
        ArrayList<Set<String>> subsets = set.getSubsets(list, 0, new ArrayList<Set<String>>());
        assertEquals(2,subsets.size());

        list.add(expectedS1);
        assertTrue(subsets.contains(expectedS1));
        assertTrue(subsets.contains(new HashSet<String>()));
    }

    @Test
    public void test_subset_of_two(){
        SetOfStrings set = new SetOfStrings();
        ArrayList<Set<String>> list = new ArrayList<Set<String>>();
        list.add(s1);
        list.add(s2);
        ArrayList<Set<String>> subsets = set.getSubsets(list, 0, new ArrayList<Set<String>>());
        assertEquals(4,subsets.size());
        assertTrue(subsets.contains(expectedS1));
        assertTrue(subsets.contains(expectedS2));
        assertTrue(subsets.contains(expectedS1S2));
        assertTrue(subsets.contains(new HashSet<String>()));
    }

    @Test
    public void test_subset_of_three(){
        SetOfStrings set = new SetOfStrings();
        ArrayList<Set<String>> list = new ArrayList<Set<String>>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        ArrayList<Set<String>> subsets = set.getSubsets(list, 0, new ArrayList<Set<String>>());
        assertEquals(8,subsets.size());
        assertTrue(subsets.contains(expectedS1));
        assertTrue(subsets.contains(expectedS2));
        assertTrue(subsets.contains(expectedS3));
        assertTrue(subsets.contains(expectedS1S2));
        assertTrue(subsets.contains(expectedS2S3));
        assertTrue(subsets.contains(expectedS1S3));
        assertTrue(subsets.contains(expectedS1S2S3));
        assertTrue(subsets.contains(new HashSet<String>()));
    }

}