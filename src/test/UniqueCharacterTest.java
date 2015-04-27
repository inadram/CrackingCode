package test;

import main.dataStructures.ArraysAndStrings.one.UniqueCharacter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class UniqueCharacterTest {

    UniqueCharacter uniqueCharacter;
    String uniqueCharacterString = "asdfghjkloiuytr";
    String NotUniqueCharacterString = "asdfghajkloiuytr";

    @BeforeClass
    public void setup() {
        uniqueCharacter= new UniqueCharacter();
    }

    @Test
    public void test_string_have_unique_character_with_HashSet(){
        assertTrue(uniqueCharacter.checkWithHashSet(uniqueCharacterString));
        assertFalse(uniqueCharacter.checkWithHashSet(NotUniqueCharacterString));
    }

    @Test
    public void test_string_have_unique_character_with_no_additional_dataStructure(){
        assertTrue(uniqueCharacter.checkWithNoAdditionalDataStructure(uniqueCharacterString));
        assertFalse(uniqueCharacter.checkWithNoAdditionalDataStructure(NotUniqueCharacterString));
    }

    @Test
    public void test_string_have_unique_character_with_StringBuilder(){
        assertTrue(uniqueCharacter.checkWithStringBuilder(uniqueCharacterString));
        assertFalse(uniqueCharacter.checkWithStringBuilder(NotUniqueCharacterString));
    }

    @Test
    public void test_string_have_unique_character_with_ascii_table(){
        assertTrue(uniqueCharacter.checkWithAsciiTable(uniqueCharacterString));
        assertFalse(uniqueCharacter.checkWithAsciiTable(NotUniqueCharacterString));
    }

    @Test
    public void test_string_have_unique_character_with_recursive(){
        assertTrue(uniqueCharacter.checkWithAsciiTableRecursive(uniqueCharacterString));
        assertFalse(uniqueCharacter.checkWithAsciiTableRecursive(NotUniqueCharacterString));
    }

    @Test
    public void test_string_have_unique_character_with_bit(){
        assertTrue(uniqueCharacter.checkWithBit(uniqueCharacterString));
        assertFalse(uniqueCharacter.checkWithBit(NotUniqueCharacterString));
    }

    @Test
    public void test_string_have_unique_character_with_sorting(){
        assertTrue(uniqueCharacter.checkWithSorting(uniqueCharacterString));
        assertFalse(uniqueCharacter.checkWithSorting(NotUniqueCharacterString));
    }
}
