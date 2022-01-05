package ua.com.foxminded.lms.anagrams;
import java.util.Scanner;

/**
 *Task 1 - Anagrams 
 *Write an application that reverses all the words of input text:
 *E.g. "abcd efgh" => "dcba hgfe"
 *All non-letter symbols should stay on the same places:
 *E.g. "a1bcd efg!h" => "d1cba hgf!e"
 *Use Latin alphabet for test only.
 */

public class App 
{
    public static void main( String[] args )
    {
    
    	
    	 
    	 String input, output;
    	    	
    	 Menu menu = new Menu();
    	 AnagramsUtils anagram = new AnagramsUtils();
    	 
    	 menu.greeting();
    	 
    	 System.out.println("Please, enter the text:");
    	 Scanner in = new Scanner(System.in);
    	 input = in.nextLine();
    	 in.close();
    	 output = anagram.reverse(input);
    	 System.out.println("Output text: ");
    	 System.out.println(output);
    	 
    	 menu.farewell();
    	 
    	 
    }
}
