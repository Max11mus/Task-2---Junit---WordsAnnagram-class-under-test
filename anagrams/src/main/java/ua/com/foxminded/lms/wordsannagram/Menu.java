package ua.com.foxminded.lms.anagrams;

public class Menu {

	public void greeting () {
		
		String greetings = "\t \t \t HELLO !!! \r\n It's an "
			+ "application that reverses all the words of input text:\r\n"
			+ "\r\n"
			+ "  E.g. \"abcd efgh\" => \"dcba hgfe\"\r\n"
			+ "\r\n"
			+ "All non-letter symbols should stay on the same places:\r\n"
			+ "\r\n"
			+ "  E.g. \"a1bcd efg!h\" => \"d1cba hgf!e\"\r\n"
			+ "\r\n"
			+ "Use Latin alphabet for test only. \r\n";
		System.out.println(greetings);
		
		}
	

	public void farewell() {
		
		String farewell = "\t \t \t GOODBYE !!!"; 
		System.out.println(farewell);
		
	}
	
	
	
}
