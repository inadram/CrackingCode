package main.dataStructures.arraysAndStrings.one;

import java.util.HashSet;

public class UniqueCharacter {
    public boolean checkWithHashSet(String uniqueCharacterString) {
        HashSet<Character> verifyUniquenessHashSet =new HashSet<Character>();
        for(Character c: uniqueCharacterString.toCharArray()){
              verifyUniquenessHashSet.add(c);
        }
        return uniqueCharacterString.toCharArray().length == verifyUniquenessHashSet.size();
    }

    public boolean checkWithNoAdditionalDataStructure(String uniqueCharacterString) {
        int initialSize= uniqueCharacterString.toCharArray().length;
        for(Character character:uniqueCharacterString.toCharArray()){
            String replacedString = uniqueCharacterString.replaceAll(character.toString(), "");
            int afterDeductionSize = replacedString.toCharArray().length;
            if(initialSize - afterDeductionSize >1){
                return false;
            }else{
               initialSize = afterDeductionSize;
            }
        }
        return true;
    }
}
