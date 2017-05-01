import  Moderate.Thirteen.BiNode;
import  Moderate.Thirteen.BiNodeDataStructure;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BiNodeDataStructureTest {

    @Test
    public void test_convert_tree_to_double_linked_list(){

        BiNode biNode_100 = new BiNode(100);

        BiNode biNode_50 = biNode_100.addFirst(50);
        BiNode biNode_150 =biNode_100.addSecond(150);

        BiNode biNode_20 = biNode_50.addFirst(20);
        BiNode biNode_70 = biNode_50.addSecond(70);

        biNode_20.addFirst(10);
        biNode_20.addSecond(30);

        biNode_70.addFirst(60);
        biNode_70.addSecond(80);

        biNode_150.addFirst(110);
        BiNode biNode_170 = biNode_150.addSecond(170);

        biNode_170.addFirst(160);
        biNode_170.addSecond(180);

        BiNodeDataStructure biNodeDataStructure = new BiNodeDataStructure();
        BiNode actual= biNodeDataStructure.fromTreeToDoubleLinkedList(biNode_100);

        BiNode biNode_d_10 = new BiNode(10);

        BiNode biNode_d_20 = biNode_d_10.addFirst(20);
        biNode_d_20.second = biNode_d_10;

        BiNode biNode_d_30 = biNode_d_20.addFirst(30);
        biNode_d_30.second = biNode_d_20;

        BiNode biNode_d_50 = biNode_d_30.addFirst(50);
        biNode_d_50.second = biNode_d_30;

        BiNode biNode_d_60 = biNode_d_50.addFirst(60);
        biNode_d_60.second = biNode_d_50;

        BiNode biNode_d_70 = biNode_d_60.addFirst(70);
        biNode_d_70.second = biNode_d_60;

        BiNode biNode_d_80 = biNode_d_70.addFirst(80);
        biNode_d_80.second = biNode_d_70;

        BiNode biNode_d_100 = biNode_d_80.addFirst(100);
        biNode_d_100.second = biNode_d_80;

        BiNode biNode_d_110 = biNode_d_100.addFirst(110);
        biNode_d_110.second = biNode_d_100;

        BiNode biNode_d_150 = biNode_d_110.addFirst(150);
        biNode_d_150.second = biNode_d_110;

        BiNode biNode_d_160 = biNode_d_150.addFirst(160);
        biNode_d_160.second = biNode_d_150;

        BiNode biNode_d_170 = biNode_d_160.addFirst(170);
        biNode_d_170.second = biNode_d_160;

        biNode_d_170.addFirst(180);
        for(int i=0;i<12;i++) {
            assertEquals(biNode_d_10.data, actual.data);
            biNode_d_10 = biNode_d_10.first;
            actual = actual.second;
        }

    }

}