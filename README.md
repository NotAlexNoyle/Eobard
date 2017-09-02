# Eobard
Java application that reverses any given text. Built for practice.

This task can be done in half the lines and much less complexity by using the "StringBuilder" calss, but I wanted to build it on my own to get un-rusty from basic Java, so the only thing I allowed myself to use was basic programmatic operations and ArrayList.

Screenshots:

![First Launch](i.imgur.com/aGiGjwJ.png)

![Result](i.imgur.com/aG123cc.png)

To run:

1. Download .jar
2. Open shell
3. cd to download directory
4. Type "java -jar Eobard.jar"
5. Profit?


Below is a much simpler way to do this. Enjoy: 

================================================

	import javax.swing.JOptionPane;

	public class TestingGrounds {

		public static void main(String[] args) {

			String stringToReverse = JOptionPane.showInputDialog(null, "String To Reverse:");

			JOptionPane.showMessageDialog(null, new StringBuilder(stringToReverse).reverse().toString());

		}

	}
