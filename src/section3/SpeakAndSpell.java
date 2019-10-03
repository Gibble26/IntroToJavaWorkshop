package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("spell mandlebrot");
		// 2. Catch the user's answer in a String
String A = JOptionPane.showInputDialog("Go on, spell it");
		// 3. If the user spelled the word correctly, speak "correct"
if(A.equalsIgnoreCase("mandlebrot")) {
	speak("correct. you are smart.");
	
	
}
		// 4. Otherwise say "wrong"
else {
speak("wrong you dumb dumb");	
	
}
		// 5. repeat the process for other words
speak("spell arachnophobia");
String B = JOptionPane.showInputDialog("Go on, spell it");
if(B.equalsIgnoreCase("arachnophobia")) {
	speak("correct. you are smart.");
	
}
else {
	speak("you are the big dumb");
}
speak("spell pneumonoultramicroscopicsilicovolcanoconiosis");
String C = JOptionPane.showInputDialog("Go on, spell it");
if(C.equalsIgnoreCase("pneumonoultramicroscopicsilicovolcanoconiosis")) {
	speak("correct. you are big brain.");
}
else {
	speak("you are small brain");
}
	}
	

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


