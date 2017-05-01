package dataStructures.ArraysAndStrings.Eight;

public class StringRotation {
    public boolean check(String first, String second) {
        if(first.length()!=second.length()){
            return false;
        }
        char firstChar = first.charAt(0);
        String startSecond = second.substring(second.indexOf(firstChar), second.length());
        String endSecond = second.substring(0, second.indexOf(firstChar));
        second= startSecond.concat(endSecond);
        return second.equals(first);
    }

    public boolean checkWithSubString(String first, String second) {
        return first.length() == second.length() && first.length() > 0 && isSubstring(second, first.concat(first));
    }

    private boolean isSubstring(String second, String concat) {
        //check if xy is substring of xyxy
        return true;
    }
}
