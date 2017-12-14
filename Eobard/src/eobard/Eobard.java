// Package declaration
package eobard;

// Import dialog box library
import javax.swing.JOptionPane;

// Class declaration
public class Eobard {
	
	// init main
	public static void main(String[] args) {
		
		// Receives text input from user and stores it in a string
		String stringToReverse = JOptionPane.showInputDialog(null, "Text To Reverse:", "Eobard", JOptionPane.INFORMATION_MESSAGE);
		
		// Keeps track of whether or not the user input is blank
		boolean hasCharacters = false;
		// Runs while user input is blank
		while(hasCharacters == false) {
			
			// Checks individual characters to see if they are comprised of only whitespace
			for(int i = 0; i < stringToReverse.length(); i++) {
				
				//  If a non-whitespace character is found, the loop will stop next time
				if(Character.isWhitespace(stringToReverse.charAt(i)) == false) {
					
					// Breaks out of loops when user input contains non-whitespace characters
					hasCharacters = true;
					
				}
				
			}
			
			// Runs if user input is whitespace
			if(hasCharacters == false) {
				
				// Asks user to re-enter their input so that it is not blank (until it is or the user closes the program). Passes the value to original input string for re-evaluation
				stringToReverse = JOptionPane.showInputDialog(null, "You left the field blank. Please try again. Text To Reverse: ", "Eobard", JOptionPane.INFORMATION_MESSAGE);
				
			}

		}
		
		// Calls stringReverser method and stores output as String
		String result = stringReverser(stringToReverse);
		
		// Displays result to user (with formatting)
		JOptionPane.showConfirmDialog(null, new Object[]{"Reversed Text: ", result}, "Eobard", JOptionPane.DEFAULT_OPTION);

	}
	
	// String manipulation method
	public static String stringReverser(String stringMessenger) {
		
		// Declare character array that is equal to the length of the string
		char[] stringReverserArray = new char[stringMessenger.length()];
		
		// Declares 'i' to count down, and j to count up, thus, allowing the program to manipulate characters both forward and backward. Includes correction for zero index(s)
		for(int i = stringMessenger.length() - 1, j = 0; i > -1; i--) {
			
			// Adds characters from the length of the string to zero to the index of stringReverserList in the reverse counting direction
			stringReverserArray[j++] = (stringMessenger.charAt(i));
			
			// Appends characters from stringReverserList to the String later to be returned.
			stringMessenger += stringReverserArray[j - 1];
			
		}
		
		// Purges first half of string (non-reversed section)
		stringMessenger = stringMessenger.substring((stringMessenger.length() / 2), stringMessenger.length());
		
		// Returns string in question
		return stringMessenger;
		
	}

// %end
}