package ua.com.foxminded.lms.wordsannagramtest;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		WordsAnnagram anagram = new WordsAnnagram();
		Scanner in = new Scanner(System.in);

		System.out.println("\t \t \t HELLO !!! \r\n It's an "
				+ "application that reverses all the words of input text:\r\n" + "\r\n"
				+ "  E.g. \"abcd efgh\" => \"dcba hgfe\"\r\n" + "\r\n"
				+ "All non-letter symbols should stay on the same places:\r\n" + "\r\n"
				+ "  E.g. \"a1bcd efg!h\" => \"d1cba hgf!e\"\r\n" + "\r\n" + "Use Latin alphabet for test only. \r\n");
		System.out.println("Please, enter the text:");
		String input = in.nextLine();
		in.close();
		System.out.println("Output text: ");
		System.out.println(anagram.reverseOnlyLetters(input));
		System.out.println("\t \t \t GOODBYE !!!");
	}

}
