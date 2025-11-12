package Aufgabe4;

public class NumberFormat {
	public static void main(String[] args) {
		int number = 1;
		int secondNumber = 2;
		System.out.print(String.format("Dies ist ein Text mit dem eine Zahl gedruckt wird: \"%d\"\n", number));
		System.out.print(String.format("Nochmal die gleiche Zahl mit führenden Leerzeichen: \"%4d\"\n", number));
		System.out.print(String.format("Nochmals die Zahl mit führenden Nullen: %04d\n", number));
		System.out.print(String.format("Und jetzt mehrere Zahlen: %06d und %08d\n", number, secondNumber));
		
		// So geht es noch kürzer
		System.out.format("Dies ist ein Text mit dem eine Zahl gedruckt wird: \"%d\"\n", number);
	}
}
