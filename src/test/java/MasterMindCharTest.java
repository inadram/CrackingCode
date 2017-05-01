import  Moderate.Five.MasterMindChar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MasterMindCharTest {

    @Test
    public void test_master_mind(){
        MasterMindChar masterMind = new MasterMindChar("RGBY","GGRR");
        assertEquals(1, masterMind.getHits());
        assertEquals(1,masterMind.getPseudoHit());
    }
    @Test
    public void test_master_mind_duplicate_char(){
        MasterMindChar masterMind = new MasterMindChar("RGBR","GGRR");
        assertEquals(2, masterMind.getHits());
        assertEquals(1,masterMind.getPseudoHit());
    }

}