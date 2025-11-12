package aufgabe1;
import static de.tha.prog.tools.Input.*;
public class StringCompare {
	public static boolean compareString(String string)
	{
		// Hinweis: Der Compilerfehler an dieser Stelle ist geplant. Mit ihrer Lösung sollte er verschwinden
		String eingabe = readLine("Geben Sie bitte den String ein: ");
		String word = "Programmieren";
	return word.equals(eingabe);
	// return word == "Programmieren";
		
	}

}
