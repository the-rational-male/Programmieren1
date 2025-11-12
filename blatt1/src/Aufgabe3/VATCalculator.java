package Aufgabe3;
import static de.tha.prog.tools.Input.*;

public class VATCalculator {
	public static void main(String[] args) {
		
		System.out.println("Aufgabe 3a");
		float price = readFloat("Geben Sie bitte den Float-Wert ein: ");
		System.out.println("Eingabe = " + price);
		System.out.println("\nAufgabe 3b\nBruttopreis: " +calculateVATPrice(100f, 19f) +" €");
		System.out.println("\nAufgabe 3c");
		float netto = readFloat("Bitte den Nettopreis eingeben: ");
		System.out.println("\nNetto-Preis: " + netto);
		System.out.println("Preis mit 19% Mehrwertsteuer: " + calculateVATPrice(netto, 19f));
		System.out.println("Preis mit 07% Mehrwertsteuer: " + calculateVATPrice(netto, 7f));
		System.out.println("\nAufgabe 3d");
		System.out.println("Aufgerundet: ");
		System.out.println("Preis mit 19% Mehrwertsteuer: " + calculateVATPriceRounded(netto, 19f));
		System.out.println("Preis mit 07% Mehrwertsteuer: " + calculateVATPriceRounded(netto, 7f));
	}
	
	public static float calculateVATPrice(float price, float tax)
	{
		tax = tax/100f;
		float brutto = price + (tax * price);
		return brutto;
	}
	
	public static float calculateVATPriceRounded(float price, float tax)
	{
		tax = ((tax/100f));
		float brutto = price + (tax * price);
		brutto = Math.round(brutto * 100f)/100f;
		return brutto;
	}
}
