package main.dataStructures.ArraysAndStrings.Five;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapCompression {

    public String compress(String inputString) {
        SortedMap<Character,Integer> countSortedOccurrence =new TreeMap<Character, Integer>();
        for(char character:inputString.toCharArray()){
            Integer count = countSortedOccurrence.containsKey(character)?countSortedOccurrence.get(character):0;
            countSortedOccurrence.put(character,++count);
        }
        StringBuilder compressedStringBuilder=new StringBuilder();
        for(Map.Entry<Character,Integer> entrySet:countSortedOccurrence.entrySet()){
            compressedStringBuilder.append(entrySet.getKey()).append("").append(entrySet.getValue());
        }
        String compressedString = compressedStringBuilder.toString();
        return (compressedString.length()<inputString.length())? compressedString :inputString;
    }
}
