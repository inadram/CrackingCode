import  Questions.ID15556758.DpIsland;
import org.junit.Test;

import java.text.DecimalFormat;

import static junit.framework.TestCase.assertEquals;


public class DpIslandTest {

    @Test
    public void test_possibility(){
        DpIsland island=new DpIsland();
        int x = 2;
        int y=2;
        double actual =island.aliveProb(x,y,4,3);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        assertEquals("0.97", decimalFormat.format(actual));

    }

}