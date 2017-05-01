import Moderate.Five.MasterMind;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MasterMindTest {

	@Test
	public void test_master_mind() {
		MasterMind masterMind = new MasterMind("RGBY", "GGRR");
		assertEquals(1, masterMind.getHits());
		assertEquals(1, masterMind.getPseudoHit());
	}

	@Test
	public void test_master_mind_duplicate_char() {
		MasterMind masterMind = new MasterMind("RGBR", "GGRR");
		assertEquals(2, masterMind.getHits());
		assertEquals(1, masterMind.getPseudoHit());
	}

}