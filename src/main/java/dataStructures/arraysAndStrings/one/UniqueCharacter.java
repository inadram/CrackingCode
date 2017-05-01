package dataStructures.ArraysAndStrings.one;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueCharacter {
    public boolean checkWithHashSet(String characterString) {
        HashSet<Character> verifyUniquenessHashSet = new HashSet<Character>();
        for (Character c : characterString.toCharArray()) {
            verifyUniquenessHashSet.add(c);
        }
        return characterString.toCharArray().length == verifyUniquenessHashSet.size();
    }

    public boolean checkWithNoAdditionalDataStructure(String characterString) {
        int initialSize = characterString.toCharArray().length;
        for (Character character : characterString.toCharArray()) {
            String replacedString = characterString.replaceAll(character.toString(), "");
            int afterDeductionSize = replacedString.toCharArray().length;
            if (initialSize - afterDeductionSize > 1) {
                return false;
            } else {
                initialSize = afterDeductionSize;
            }
        }
        return true;
    }

    public boolean checkWithStringBuilder(String charactersString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : charactersString.toCharArray()) {
            if (stringBuilder.indexOf(character.toString()) >= 0) {
                return false;
            }
            stringBuilder.append(character);
        }
        return true;
    }

    public boolean checkWithAsciiTable(String charactersString) {
        if (charactersString.length() > 256) {
            return false;
        }
        // 256 in ascii string, 2 power 21 in unicode
        boolean[] characters = new boolean[256];
        for (Character character : charactersString.toCharArray()) {
            if (characters[character]) {
                return false;
            }
            characters[character] = true;
        }
        return true;
    }

    public boolean checkWithAsciiTableRecursive(String charactersString) {
        if (charactersString.length() > 256) {
            return false;
        }
        // 256 in ascii string, 2 power 21 in unicode
        boolean[] allCharacters = new boolean[256];
        return charRecursive(charactersString.toCharArray(), allCharacters,0);
    }

    private boolean charRecursive(char[] characters, boolean[] allCharacters, int index) {
        if (characters.length<=index) {
            return true;
        }
        else if(allCharacters[characters[index]]){
            return false;
        }
        allCharacters[characters[index]] = true;
        return charRecursive(characters,allCharacters,++index);
    }

    public boolean checkWithBit(String characterString) {
        int checker =0;
        for (char character:characterString.toCharArray()){
            // reduce the 97 from char to have less number of bits
            character -= 'a';
            if((checker  & (1<<character)) > 0){
               return false;
            }else{
                checker|=1<<character;
            }
        }
        return true;
    }

    public boolean checkWithSorting(String characterString) {
        char[] characters = characterString.toCharArray();
        Arrays.sort(characters);
        return  checkWithBit(new String(characters));
    }
}
