import Moderate.Nine.WordFrequency;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordFrequencyTest {

	@Test
	public void test_find_word_frequency() {
		String someLongString = "Wiki software (also known as a wiki engine or wiki application[citation needed])" +
				" is collaborative software that runs a wiki, i.e., a website that allows users to create and collaboratively" +
				" edit web pages via a web browser. A wiki system is usually a web application that runs on one or more web " +
				"servers. The content, including all current and previous revisions, is usually stored in either a file " +
				"system or a database. Wikis are a type of web content management system, and the most commonly supported " +
				"off-the-shelf software that web hosting facilities offer. There are currently dozens of actively maintained " +
				"wiki engines, in a variety of programming languages, including both open source and proprietary applications." +
				" These vary widely in their platform support, their support for natural language characters and conventions, " +
				"and in their assumptions about technical versus social control of editing.";
		WordFrequency wordFrequency = new WordFrequency(someLongString);

		assertEquals(6, wordFrequency.find("wiki"));
	}


}