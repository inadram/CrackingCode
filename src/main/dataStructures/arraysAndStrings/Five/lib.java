package main.dataStructures.arraysAndStrings.Five;

public class lib {
    public static int countCompressedCharacters(String someString) {
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
    public static boolean shouldReturnOriginalString(String someString) {
        return someString.length() <= countCompressedCharacters(someString);
    }
}
