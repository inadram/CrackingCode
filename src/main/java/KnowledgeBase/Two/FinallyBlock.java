package KnowledgeBase.Two;

public class FinallyBlock {
    public boolean try_flag, cache_flag, finally_flag;

    public String TryCacheFinallyBlock() {
        try {
            try_flag = true;
            return "return try";
        } catch (Exception exp) {
            cache_flag = true;
            return "return cache";
        } finally {
            finally_flag = true;
        }
    }
}
