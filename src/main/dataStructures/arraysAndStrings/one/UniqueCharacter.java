package main.dataStructures.arraysAndStrings.one;

import java.util.HashSet;

public class UniqueCharacter {
    public boolean checkWithHashSet(String characterString) {
        HashSet<Character> verifyUniquenessHashSet =new HashSet<Character>();
        for(Character c: characterString.toCharArray()){
              verifyUniquenessHashSet.add(c);
        }
        return characterString.toCharArray().length == verifyUniquenessHashSet.size();
    }

    public boolean checkWithNoAdditionalDataStructure(String characterString) {
        int initialSize= characterString.toCharArray().length;
        for(Character character:characterString.toCharArray()){
            String replacedString = characterString.replaceAll(character.toString(), "");
            int afterDeductionSize = replacedString.toCharArray().length;
            if(initialSize - afterDeductionSize >1){
                return false;
            }else{
               initialSize = afterDeductionSize;
            }
        }
        return true;
    }

    public boolean checkWithStringBuilder(String charactersString){
        StringBuilder stringBuilder = new StringBuilder();
        for(Character character:charactersString.toCharArray()){
            if(stringBuilder.indexOf(character.toString())>=0){
                return false;
            }
            stringBuilder.append(character);
        }
        return true;
    }

    public boolean checkWithAsciiTable(String charactersString) {
        if(charactersString.length()>256){
            return false;
        }
        // 256 in ascii string, 2 power 21 in unicode
        boolean[] characters = new boolean[256];
        for(Character character:charactersString.toCharArray()){
            if(characters[character]){
                return false;
            }
            characters[character] = true;
        }
        return true;
    }
}
