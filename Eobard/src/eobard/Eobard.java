package eobard;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Eobard {
	
	public static void main(String[] args) {
		
		String stringToReverse = JOptionPane.showInputDialog(null, "String To Reverse:");
		
		String result = stringReverser(stringToReverse).toString();
		
		JOptionPane.showMessageDialog(null, result);
		
	}
	
	public static String stringReverser(String stringMessenger) {
		
		List<Character> stringReverserList = new ArrayList<>();
		
		for(int i = stringMessenger.length() - 1; i > -1; i--) {
			stringReverserList.add(stringMessenger.charAt(i));
		}
		for(int i = 0; i < stringReverserList.size(); i++) {
			stringMessenger += stringReverserList.get(i);
		}
		stringMessenger = stringMessenger.substring((stringMessenger.length() / 2), stringMessenger.length());
		
		return stringMessenger;
		
	}

}