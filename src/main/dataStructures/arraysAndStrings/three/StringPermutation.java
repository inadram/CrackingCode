package main.dataStructures.arraysAndStrings.three;

import java.util.Arrays;

public class StringPermutation {
    public boolean check(String one, String two) {
        if(one.length()!=two.length()){
            return false;
        }
        int lengthIndex = one.length()-1;
        for(int i=0;i<= lengthIndex;i++){
            if(one.charAt(i)!=two.charAt(lengthIndex-i)){
               return false;
            }
        }
        return true;
    }

    public boolean checkRevers(String one, String two) {
        StringBuilder stringBuilder =new StringBuilder(one);
        return stringBuilder.reverse().toString().equals(two);
    }
}
