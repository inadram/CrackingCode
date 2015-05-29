package test;

import main.ConceptsAndAlgorothms.RecursionAndDynamicProgramming.Four.SetOfStringsIteratively;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class SetOfStringsIterativelyTest {

    Set<String> s1;
    Set<String> s2;
    Set<String> s3;
    ArrayList<String> expectedS1;
    ArrayList<String> expectedS2;
    ArrayList<String> expectedS3;
    ArrayList<String> expectedS1S2;
    ArrayList<String> expectedS1S3;
    ArrayList<String> expectedS2S3;
    ArrayList<String> expectedS1S2S3;
    @Before
    public void setUp(){
        s1 =new HashSet<String>();
        s1.add("S1");

        s2 =new HashSet<String>();
        s2.add("S2");

        s3 =new HashSet<String>();
        s3.add("S3");


        expectedS1 =new ArrayList<String>();
        expectedS1.add("S1");

        expectedS2 =new ArrayList<String>();
        expectedS2.add("S2");

        expectedS3 =new ArrayList<String>();
        expectedS3.add("S3");

        expectedS1S2 =new ArrayList<String>();
        expectedS1S2.add("S1");
        expectedS1S2.add("S2");

        expectedS1S3 =new ArrayList<String>();
        expectedS1S3.add("S1");
        expectedS1S3.add("S3");

        expectedS2S3 =new ArrayList<String>();
        expectedS2S3.add("S2");
        expectedS2S3.add("S3");

        expectedS1S2S3 =new ArrayList<String>();
        expectedS1S2S3.add("S1");
        expectedS1S2S3.add("S2");
        expectedS1S2S3.add("S3");
    }

    @Test
    public void test_subset_of_one(){
        SetOfStringsIteratively set = new SetOfStringsIteratively();
        ArrayList<String> list = new ArrayList<String>();

        list.add("S1");
        ArrayList<ArrayList<String>> subsets = set.getSubsets(list);
        assertEquals(2,subsets.size());

        list.add("S1");
        assertTrue(subsets.contains(expectedS1));
        assertTrue(subsets.contains(new ArrayList<String>()));
    }

    @Test
    public void test_subset_of_two(){
        SetOfStringsIteratively set = new SetOfStringsIteratively();
        ArrayList<String> list = new ArrayList<String>();
        list.add("S1");
        list.add("S2");
        ArrayList<ArrayList<String>> subsets = set.getSubsets(list);
        assertEquals(4,subsets.size());
        assertTrue(subsets.contains(expectedS1));
        assertTrue(subsets.contains(expectedS2));
        assertTrue(subsets.contains(expectedS1S2));
        assertTrue(subsets.contains(new ArrayList<String>()));
    }

    @Test
    public void test_subset_of_three(){
        SetOfStringsIteratively set = new SetOfStringsIteratively();
        ArrayList<String> list = new ArrayList<String>();
        list.add("S1");
        list.add("S2");
        list.add("S3");
        ArrayList<ArrayList<String>> subsets = set.getSubsets(list);
        assertEquals(8,subsets.size());
        assertTrue(subsets.contains(expectedS1));
        assertTrue(subsets.contains(expectedS2));
        assertTrue(subsets.contains(expectedS3));
        assertTrue(subsets.contains(expectedS1S2));
        assertTrue(subsets.contains(expectedS2S3));
        assertTrue(subsets.contains(expectedS1S3));
        assertTrue(subsets.contains(expectedS1S2S3));
        assertTrue(subsets.contains(new ArrayList<String>()));
    }


}