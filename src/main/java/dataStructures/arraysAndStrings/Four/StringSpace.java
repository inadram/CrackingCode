package dataStructures.ArraysAndStrings.Four;

public class StringSpace {
    public char[] replaceWith20Percent(char[] someString) {
        int numberOfSpaces = countNumberOfSpaces(someString);
        int indexLengthOfNewString = numberOfSpaces * 2 + someString.length;
        char[] characters = new char[indexLengthOfNewString];
        for(int i=someString.length-1;i>=0;i--){
            if(someString[i]==' '){
                characters[i+(numberOfSpaces*2)]='0';
                characters[i+(numberOfSpaces*2)-1]='2';
                characters[i+(numberOfSpaces*2)-2]='%';
                numberOfSpaces--;
            }else{
                characters[i+(numberOfSpaces*2)]=someString[i];
            }
        }
        return characters;
    }

    public char[] replaceWith20PercentInPlace(char[] someString, int length) {
        int numberOfSpaces = countNumberOfSpaces(someString);
        int indexLengthOfNewString = numberOfSpaces * 2 + length;
        for(int i=length-1;i>=0;i--){
            if(someString[i]==' '){
                someString[indexLengthOfNewString-1]='0';
                someString[indexLengthOfNewString-2]='2';
                someString[indexLengthOfNewString-3]='%';
                indexLengthOfNewString-=3;
            }else{
                someString[indexLengthOfNewString -1]=someString[i];
                indexLengthOfNewString-=1;
            }
        }
        return someString;
    }

    private int countNumberOfSpaces(char[] someString) {
        int counter=0;
        for(char character:someString){
            if(character ==' '){
                counter++;
            }
        }
        return counter;
    }
}
