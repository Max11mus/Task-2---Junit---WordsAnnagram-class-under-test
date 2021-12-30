package ua.com.foxminded.lms.anagrams;



public final class Anagrams {

	public  String reverse(String input) {
		
		String result = "";
		String [] words = splitToWords(input);
		
		if (words.length != 0) {
			for (int i = 0; i < words.length; i++) {
			words[i] = reverseWord(words[i]);
			result += " " + words[i] ;
			}
		result = result.trim();
	    }	
	return result;
	}
		
	private  String [] splitToWords(String input) {
		
		String [] result = input.split(" ",-1);
		return result;
	}
	
	
	private  String reverseWord(String input) {
		
		char [] resultChars = input.toCharArray();
	    String onlyLettersReversed="";
		
		for (char c : resultChars) {
			if (Character.isLetter(c)) {
				onlyLettersReversed = c + onlyLettersReversed;
			} 
		}
		
		for (int i = 0, indexOnlyLettersReversed = 0; i < resultChars.length; i++) {
			char c = resultChars[i];
			if (Character.isLetter(c)) {
					onlyLettersReversed.getChars(indexOnlyLettersReversed, 
					indexOnlyLettersReversed+1, resultChars, i);
					indexOnlyLettersReversed++;
			} 
		}
				
		String result = new String(resultChars);
		return result;
	}
}
