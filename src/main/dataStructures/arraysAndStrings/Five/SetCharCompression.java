package main.dataStructures.arraysAndStrings.Five;

public class SetCharCompression {

    public String compress(String someString) {
        int size = lib.countCompressedCharacters(someString);
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
