package ua.com.foxminded.lms.wordsannagramtest;

public final class WordsAnnagram {
	public static final String DELIMITER = " ";
	public static final int STRING_SPLITED_COMPLETELY = -1;

	public String reverseOnlyLetters(String input) {
		if (input == null) {
			throw new IllegalArgumentException("ERROR: Null Pointer Argument.");
		} else {
			String result = "";
			String[] words = input.split(DELIMITER, STRING_SPLITED_COMPLETELY);

			if (words.length != 0) {
				result = reverseWord(words[0]);
				for (int i = 1; i < words.length; i++) {
					words[i] = reverseWord(words[i]);
					result = result.concat(DELIMITER);
					result = result.concat(words[i]);
				}
			}
			return result;
		}
	}

	private String reverseWord(String input) {
		char[] inputChars = input.toCharArray();
		char[] resultChars = input.toCharArray();

		for (int i = 0, k = (inputChars.length - 1); i < resultChars.length; i++) {
			while ((k >= 1) && (!Character.isLetter(inputChars[k]))) {
				k--;
			}
			if ((Character.isLetter(resultChars[i])) && (k >= 0)) {
				resultChars[i] = inputChars[k];
				k--;
			}
		}
		return new String(resultChars);
	}

}
