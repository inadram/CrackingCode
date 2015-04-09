package main.dataStructures.arraysAndStrings.Five;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class StringCompression {
    public String compress(String inputString) {
        SortedMap<Character,Integer> countSortedOccurrence =new TreeMap<Character, Integer>();
        for(char character:inputString.toCharArray()){
            Integer count = countSortedOccurrence.get(character);
            count = (count ==null)?1: ++count;
            countSortedOccurrence.put(character,count);
        }
        StringBuilder compressedStringBuilder=new StringBuilder();
        for(Map.Entry<Character,Integer> entrySet:countSortedOccurrence.entrySet()){
            compressedStringBuilder.append(entrySet.getKey()).append("").append(entrySet.getValue());
        }
        String compressedString = compressedStringBuilder.toString();
        return (compressedString.length()<inputString.length())? compressedString :inputString;
    }

    public String compressWithString(String someString) {
        String compressedString ="";
        char existing=someString.charAt(0);
        int count =0;
        for(char character:someString.toCharArray()){
            if(existing == character){
               count++;
            }else{
                compressedString+=existing+""+count;
                count=1;
                existing =character;
            }
        }
        return compressedString+existing+""+count;
    }
}
