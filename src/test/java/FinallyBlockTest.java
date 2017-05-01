import  KnowledgeBase.Two.FinallyBlock;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FinallyBlockTest {

    @Test
   public void test_try_cache_finally(){
       FinallyBlock finallyBlock=new FinallyBlock();
       finallyBlock.TryCacheFinallyBlock();
       assertTrue(finallyBlock.try_flag);
       assertTrue(finallyBlock.finally_flag);
       assertFalse(finallyBlock.cache_flag);
   }
}