package ua.com.foxminded.lms.wordsannagram;



public final class WordsAnnagram {

	public  String reverse(String input) {
		
		String result = "";
		String [] words = splitToWords(input);
		
		if (words.length != 0) {
			for (int i = 0; i < words.length; i++) {
			words[i] = reverseWord(words[i]);
			result += " " + words[i];
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
		
		char [] inputChars = input.toCharArray();
		char [] resultChars = input.toCharArray();
	    	    				
		for (int i = 0, k = (inputChars.length - 1) ; i < resultChars.length; i++) {
			
			char c = resultChars[i];
			char d = inputChars[k];
			
			/* This while cycle is needed, because in input string 
			   may be sequence of several non-letter chars
			   So here we detecting and of such sequence */
			while ( (!Character.isLetter(d)) && (k>=1)) {
				k--;
				d = inputChars[k];	
			}
			
			if ( (Character.isLetter(c)) && (k>=0)) {
				resultChars[i]=inputChars[k];
				k--;
			} 
								
		}
				
				
		String result = new String(resultChars);
		return result;
	}
}
