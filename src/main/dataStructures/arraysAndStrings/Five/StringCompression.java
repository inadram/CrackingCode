package main.dataStructures.arraysAndStrings.Five;

import java.util.Arrays;
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
        if(someString.length()<=countCompressedCharacters(someString)){
            return someString;
        }
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

    private int countCompressedCharacters(String someString) {
        if(someString ==null || someString.isEmpty()){
            return 0;
        }
        int length =0;
        int count=1;
        char exist = someString.charAt(0);
        for(char character:someString.toCharArray()){
            if(exist == character){
                count++;
            }
            else {
                exist=character;
                length+= 1+String.valueOf(count).length();
            }
        }
        length+= 1+String.valueOf(count).length();
        return length;
    }

    public String compressWithStringBuilder(String someString) {
        if(someString.length()<=countCompressedCharacters(someString)){
            return someString;
        }
        StringBuilder compressedString = new StringBuilder();
        char existing=someString.charAt(0);
        int count =0;
        for(char character:someString.toCharArray()){
            if(existing == character){
                count++;
            }else{
                compressedString.append(existing).append(count);
                count=1;
                existing =character;
            }
        }
        return compressedString.append(existing).append(count).toString();
    }

    public String compressWithCharArray(String someString) {
        int size = countCompressedCharacters(someString);
        if(someString.length()<= size){
            return someString;
        }
        char[] compressedArray=new char[size];
        char existing =someString.charAt(0);
        int count =0;
        int index =0;
        for(char character:someString.toCharArray()){
            if(existing == character){
                count++;
            }else{
                index = setChar(compressedArray,existing,index,count);
                count=1;
                existing =character;
            }
        }
        setChar(compressedArray,existing,index,count);
        return String.valueOf(compressedArray);
    }

    private int setChar(char[] compressedArray, char existing, int index, int count) {
       compressedArray[index]=existing;
        index++;
        char[] cnt = String.valueOf(count).toCharArray();
        for(char c:cnt){
            compressedArray[index]=c;
            index++;
        }
        return index;
    }
}
