// Package declaration
package eobard;

// Import dialog box library
import javax.swing.JOptionPane;

// Class declaration
public class Eobard {
	
	// init main
	public static void main(String[] args) {
		
		// Receives and stores string from user
		String stringToReverse = JOptionPane.showInputDialog(null, "String To Reverse:");
		
		// Calls stringReverser method and stores output as String
		String result = stringReverser(stringToReverse);
		
		// Displays result to user
		JOptionPane.showMessageDialog(null, result);
		
	}
	
	// Main string reverser method (functionality of program)
	public static String stringReverser(String stringMessenger) {
		
		// Declare character array that is equal to the length of the string
		char[] stringReverserArray = new char[stringMessenger.length()];
		
		// Declares 'i' to count down, and j to count up, thus, allowing the program to manipulate characters both forward and backward
		// // includes correction for zero index(s)
		for(int i = stringMessenger.length() - 1, j = 0; i > -1; i--) {
			
			// Adds characters from the length of the string to zero to the index of stringReverserList in the reverse counting direction
			stringReverserArray[j++] = (stringMessenger.charAt(i));
			
			// Appends characters from stringReverserList to the String later to be returned.
			stringMessenger += stringReverserArray[j - 1];
			
		}
		
		// Purges first half of string (unreversed section)
		stringMessenger = stringMessenger.substring((stringMessenger.length() / 2), stringMessenger.length());
		
		// Returns string in question
		return stringMessenger;
		
	}

// %end
}