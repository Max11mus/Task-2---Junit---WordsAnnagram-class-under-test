package ua.com.foxminded.lms.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ua.com.foxminded.lms.wordsannagramtest.WordsAnnagram;

class AnagramsTest {
	static WordsAnnagram anagram;

	@BeforeAll
	static void WordsAnnagramTestSetUp() {
		anagram = new WordsAnnagram();
	}

	@Test
	void reverseOnlyLetters_throwNullPointerException_whenInputNull() {
		assertThrows(NullPointerException.class, () -> anagram.reverseOnlyLetters(null),
				"Must throw NullPointerException exception when input null.");
	}

	@Test
	void reverseOnlyLetters_returnEmptyString_whenInputEmptyString() {
		String expected = "";
		String actual = anagram.reverseOnlyLetters("");

		assertEquals(expected, actual, "Must return empty string when input empty string.");
	}

	@Test
	void reverseOnlyLetters_returnSameString_whenInputOnlyOneWhiteSpace() {
		String expected = " ";
		String actual = anagram.reverseOnlyLetters(" ");

		assertEquals(expected, actual, "Must return same string (whitespace) when input only one whitespace.");
	}

	@Test
	void reverseOnlyLetters_returnSameString_whenInputOnlyFewWhiteSpace() {
		String expected = "   ";
		String actual = anagram.reverseOnlyLetters("   ");

		assertEquals(expected, actual, "Must return same string (few whitespace) when input only few whitespace.");
	}

	@Test
	void reverseOnlyLetters_returnSameString_whenInputOneLetter() {
		String expected = "J";
		String actual = anagram.reverseOnlyLetters("J");

		assertEquals(expected, actual, "Must return same string (one letter) when input one letter.");
	}

	@Test
	void reverseOnlyLetters_returnSameString_whenInputOneNumber() {
		String expected = "7";
		String actual = anagram.reverseOnlyLetters("7");

		assertEquals(expected, actual, "Must return same string (one number) when input one number.");
	}

	@Test
	void reverseOnlyLetters_returnSameString_whenInputOneSpecialCharacter() {
		String expected = "$";
		String actual = anagram.reverseOnlyLetters("$");

		assertEquals(expected, actual, "Must return same string (special character) when input one special character.");
	}

	@Test
	void reverseOnlyLetters_returnSameString_whenInputOneLetterFewTimes() {
		String expected = "JJJJJ";
		String actual = anagram.reverseOnlyLetters("JJJJJ");

		assertEquals(expected, actual,
				"Must return same string (one letter few times) when input one letter few times.");
	}

	@Test
	void reverseOnlyLetters_returnSameString_whenInputOneNumberFewTimes() {
		String expected = "77777";
		String actual = anagram.reverseOnlyLetters("77777");

		assertEquals(expected, actual,
				"Must return same string (one number few times) when input one number few times.");
	}

	@Test
	void reverseOnlyLetters_returnReversedString_whenInputLetterFewTimesUpperAndLowercased() {
		String expected = "JaVaIsCOOL";
		String actual = anagram.reverseOnlyLetters("LOOCsIaVaJ");

		assertEquals(expected, actual, "Must return reversed string when input letter few times upper and lowercased.");
	}

	@Test
	void reverseOnlyLetters_returnSameString_whenInputOnlySpecialCharacters() {
		String expected = "!@# $%^&*()_+";
		String actual = anagram.reverseOnlyLetters("!@# $%^&*()_+");

		assertEquals(expected, actual,
				"Must return same string (only special characters) when input only special characters.");
	}

	@Test
	void reverseOnlyLetters_returnReversedString_whenInputSpecialCharactersAndLettersAsOneWord() {
		String expected = "$$JAVA$$$Is@@@COOL";
		String actual = anagram.reverseOnlyLetters("$$LOOC$$$sI@@@AVAJ");

		assertEquals(expected, actual,
				"Must return reversed string (only letter reversed) when input special characters and letters (as one word).");
	}

	@Test
	void reverseOnlyLetters_returnSameString_whenInputSpecialCharactersAndNumbers() {
		String expected = "78!@#$%987^&*(556)_+";
		String actual = anagram.reverseOnlyLetters("78!@#$%987^&*(556)_+");

		assertEquals(expected, actual,
				"Must return same string (special characters and numbers) when input special characters and numbers.");
	}

	@Test
	void reverseOnlyLetters_returnReversedString_whenInputFewWordsWithoutNumbersAndCharacters() {
		String expected = "JaVa Is  COOL";
		String actual = anagram.reverseOnlyLetters("aVaJ sI  LOOC");

		assertEquals(expected, actual,
				"Must return reversed string when input few words without numbers and characters.");
	}

	@Test
	void reverseOnlyLetters_returnSameString_whenInputFewWordsWithNumbersWithoutCharacters() {
		String expected = "78!@ #$%987   ^&*( 556 )_+";
		String actual = anagram.reverseOnlyLetters("78!@ #$%987   ^&*( 556 )_+");

		assertEquals(expected, actual,
				"Must return same string (few words with numbers without characters) when input few words with numbers without characters.");
	}

	@Test
	void reverseOnlyLetters_returnReversedString_whenInputFewWordsWithNumbersAndCharacters() {
		String expected = "777JAVA 9Is9 77CO99OL0";
		String actual = anagram.reverseOnlyLetters("777AVAJ 9sI9 77LO99OC0");

		assertEquals(expected, actual,
				"Must return reversed string (only letter reversed) when input few words with numbers and characters.");
	}

	@Test
	void reverseOnlyLetters_returnReversedString_whenInputFewWordsSeparatedWithFewWhitespaces() {
		String expected = "777JAVA$$   9I@s9 77CO99OL0";
		String actual = anagram.reverseOnlyLetters("777AVAJ$$   9s@I9 77LO99OC0");

		assertEquals(expected, actual,
				"Must return reversed string (only letter reversed) when input few words separated with few whitespaces.");
	}

}
