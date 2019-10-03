package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String A = JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
if(A.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "I look forward to seeing you \n as our future overlord.");
	
}
		// 3. Otherwise, wish them good luck washing dishes.
else {
JOptionPane.showMessageDialog(null, "Good luck washing dishes.");
}
	}
}

