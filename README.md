# Eobard

A Java desktop application for reversing any text quickly and elegantly. Built with elementaryOS.

Changelog:

- Version 3.0.2:
	- Made error message make more sense

- Version 3.0.1:
	- Simplified input validation code

- Version 3.0:
	- Changed GUI to use "text" terminology rather than "string".
	- Completely refactored input validation to check for input comprised entirely of whitespace.
	- Added more documentation
	- Fancified input dialog boxes
	- Branded as actual application instead of practice code
	- Added TODO section
	- Added new screenshots

- Version 2.0 - The much unexpected release! Eobard is now completely refactored and documented. This version eliminates the need for the "ArrayList" library, and now the only non-default library used is JOptionPane. I also fixed the readme a bit.

- Version 1.0 - Initial Release

TO-DO:

- Polish input dialog boxes even more.
- Handle exits (close / cancel operations) better.
- Add custom icons and simpler install/launch procedures.

Screenshots:

![First Launch](https://i.imgur.com/17Umd6n.png)

![Input Validation Error](https://i.imgur.com/BX2STou.png)

![Result](https://i.imgur.com/l1iMu2H.png)

To run:

1. Download .jar
2. Open shell
3. cd to clone directory
4. Type "java -jar Eobard.jar"
5. Profit?


Below is a much simpler way to do this yourself using the StringBuilder class. Enjoy: 

================================================

	import javax.swing.JOptionPane;

	public class ReverseAString {

		public static void main(String[] args) {

			String stringToReverse = JOptionPane.showInputDialog(null, "String To Reverse:");

			JOptionPane.showMessageDialog(null, new StringBuilder(stringToReverse).reverse().toString());

		}

	}
