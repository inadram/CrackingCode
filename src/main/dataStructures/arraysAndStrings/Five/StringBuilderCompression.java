package main.dataStructures.ArraysAndStrings.Five;

public class StringBuilderCompression {
    public String compress(String someString) {
        if (Lib.shouldReturnOriginalString(someString)) return someString;

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
}
