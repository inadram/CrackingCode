package main.dataStructures.arraysAndStrings.one;

import java.util.HashSet;

public class UniqueCharacter {
    public boolean checkWithHashset(String uniqueCharacterString) {
        HashSet<Character> verifyUniquenessHashSet =new HashSet<Character>();
        for(Character c: uniqueCharacterString.toCharArray()){
              verifyUniquenessHashSet.add(c);
        }
        return uniqueCharacterString.toCharArray().length == verifyUniquenessHashSet.size();
    }
}
