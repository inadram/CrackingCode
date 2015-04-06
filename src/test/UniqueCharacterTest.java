package test;

import main.dataStructures.arraysAndStrings.one.UniqueCharacter;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class UniqueCharacterTest {

    @Test
    public void test_string_have_unique_character(){
        UniqueCharacter uniqueCharacter= new UniqueCharacter();
        String uniqueCharacterString = "asdfghjkloiuytr";
        assertTrue(uniqueCharacter.checkWithHashset(uniqueCharacterString));
        String NotUniqueCharacterString = "asdfghajkloiuytr";
        assertFalse(uniqueCharacter.checkWithHashset(NotUniqueCharacterString));
    }
}
