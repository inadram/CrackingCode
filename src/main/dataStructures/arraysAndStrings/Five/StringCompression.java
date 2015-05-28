package main.dataStructures.ArraysAndStrings.Five;

public class StringCompression {

    public String compress(String someString) {
        if (Lib.shouldReturnOriginalString(someString)) return someString;

        String compressedString ="";
        char existing=someString.charAt(0);
        int count =0;
        for(char character:someString.toCharArray()){
            if(existing == character){
               count++;
            }else{
                //performance issue !  compress(String) concatenates strings using + in a loop
                compressedString+=existing+""+count;
                count=1;
                existing =character;
            }
        }
        return compressedString+existing+""+count;
    }

}
