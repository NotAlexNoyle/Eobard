# Eobard

This task can be done in much less lines and much less visual complexity by using the "StringBuilder" class, but I wanted to build it on my own to practice writing Java, so the only thing I allowed myself to use is basic programmatic operations.

Changelog:

- Version 2.0 - The much unexpected release! Eobard is now completely refactored and documented. This version eliminates the need for the "ArrayList" library, and now the only non-default library used is JOptionPane. I also fixed the readme a bit. 
- Version 1.0 - Initial Release

Screenshots:

![First Launch](http://i.imgur.com/aGiGjwJ.png)

![Result](http://i.imgur.com/aG123cc.png)

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
