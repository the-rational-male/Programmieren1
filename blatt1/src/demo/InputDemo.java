package demo;
import static de.tha.prog.tools.Input.*;

public class InputDemo {
	public static void main(String[] args) {
		String word, line;
		double d;
		float f;
		int i;
		char c;
		
		System.out.print("Bitte ein Wort eingeben: ");
		word = readWord();
		System.out.println("Folgendes Wort wurde eingegeben: " + word);
		
		word = readWord("So kann man auch eine Eingabe erfragen: ");
		System.out.println("Das hat auch funktioniert: " + word);
		
		word = readWord("Jetzt bitte zwei Worte eingeben: ");
		System.out.println("Erstes Wort: "  + word);
		word = readWord();
		System.out.println("Zweites Wort: " + word);
		
		line = readLine("Bitte ganze Zeile eingeben: ");
		System.out.println("Zeile: " + line);
		

		i = readInteger("Bitte Integer eingeben: ");
		System.out.println("Integer: " + i);
		
		f = readFloat("Bitte Float eingeben: ");
		System.out.println("Float: " + f);
		
		d = readDouble("Bitte Double eingeben: ");
		System.out.println("Double: " + d);
		
		c = readChar("Bitte einen Buchstaben eingeben: ");
		System.out.println("Char: " + c);
		
		// Hinweis: Zu jeder der Methoden von oben gibt es auch eine 
		// Methode die keinen Text ausdruckt sondern nur den Wert liest
		// z.B. readInteger(), readDouble(), readChar(), ...		
	}
}
