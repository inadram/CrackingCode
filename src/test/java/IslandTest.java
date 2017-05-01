import  Questions.ID15556758.Island;
import org.junit.Test;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


public class IslandTest{

    @Test
    public void test_possibility(){
        int size =4;
        Island island=new Island(size);
        int x = 2;
        int y=2;
        ArrayList<Point> islandMap = new ArrayList<Point>();
        islandMap.add(new Point(x, y));
        double actual =island.getAlivePossibility(islandMap, 3, 1);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        assertEquals("0.75", decimalFormat.format(actual));

    }

}