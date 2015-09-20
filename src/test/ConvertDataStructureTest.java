package test;

import main.Moderate.Thirteen.ConvertDataStructure;
import org.junit.Test;

public class ConvertDataStructureTest {

    @Test
    public void test_convert_tree_to_double_linked_list(){

        ConvertDataStructure convertDataStructure = new ConvertDataStructure();
        convertDataStructure.fromTreeToDoubleLinkedList();
    }

}