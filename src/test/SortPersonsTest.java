package test;

import main.Questions.ID24532662.SortPersons;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortPersonsTest {

    @Test
    public void test_sort_persons(){
        SortPersons sortPersons = new SortPersons();
        int[] actual = sortPersons.sort(new int[]{3,2,1},new int[]{0,1,1});
        int[] expected = {3, 1, 2};
        for(int i =0;i<expected.length;i++){
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test_sort_persons2(){
        SortPersons sortPersons = new SortPersons();
        int[] actual = sortPersons.sort(new int[]{5,4,3,2,1},new int[]{0,1,1,2,3});
        int[] expected = {5,3,2 , 1,4};
        for(int i =0;i<expected.length;i++){
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test_sort_persons3(){
        SortPersons sortPersons = new SortPersons();
        int[] actual = sortPersons.sort(new int[]{1,5,4,3,2},new int[]{3,0,1,1,2});
        int[] expected = {5,3,2 , 1,4};
        for(int i =0;i<expected.length;i++){
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test_sort_persons4(){
        SortPersons sortPersons = new SortPersons();
        int[] actual = sortPersons.sort(new int[]{2,3,5,4,6,1},new int[]{0,3,0,0,0,4});
        int[] expected = {2,4,5,6,1,3};
        for(int i =0;i<expected.length;i++){
            assertEquals(expected[i], actual[i]);
        }
    }


}