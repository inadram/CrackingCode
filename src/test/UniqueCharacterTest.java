package test;

import main.dataStructures.arraysAndStrings.one.UniqueCharacter;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class UniqueCharacterTest {

    @Test
    public void test_string_have_unique_character_with_HashSet(){
        UniqueCharacter uniqueCharacter= new UniqueCharacter();
        String uniqueCharacterString = "asdfghjkloiuytr";
        assertTrue(uniqueCharacter.checkWithHashSet(uniqueCharacterString));
        String NotUniqueCharacterString = "asdfghajkloiuytr";
        assertFalse(uniqueCharacter.checkWithHashSet(NotUniqueCharacterString));
    }

    @Test
    public void test_string_have_unique_character_with_no_additional_dataStructure(){
        UniqueCharacter uniqueCharacter= new UniqueCharacter();
        String uniqueCharacterString = "asdfghjkloiuytr";
        assertTrue(uniqueCharacter.checkWithNoAdditionalDataStructure(uniqueCharacterString));
        String NotUniqueCharacterString = "asdfghajkloiuytr";
        assertFalse(uniqueCharacter.checkWithNoAdditionalDataStructure(NotUniqueCharacterString));
    }

    @Test
    public void test_string_have_unique_character_with_StringBuilder(){
        UniqueCharacter uniqueCharacter= new UniqueCharacter();
        String uniqueCharacterString = "asdfghjkloiuytr";
        assertTrue(uniqueCharacter.checkWithStringBuilder(uniqueCharacterString));
        String NotUniqueCharacterString = "asdfghajkloiuytr";
        assertFalse(uniqueCharacter.checkWithStringBuilder(NotUniqueCharacterString));
    }

    @Test
    public void test_string_have_unique_character_with_ascii_table(){
        UniqueCharacter uniqueCharacter= new UniqueCharacter();
        String uniqueCharacterString = "asdfghjkloiuytr";
        assertTrue(uniqueCharacter.checkWithAsciiTable(uniqueCharacterString));
        String NotUniqueCharacterString = "asdfghajkloiuytr";
        assertFalse(uniqueCharacter.checkWithAsciiTable(NotUniqueCharacterString));
    }
}
