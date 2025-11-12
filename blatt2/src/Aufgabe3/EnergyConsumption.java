package Aufgabe3;
import static de.tha.prog.tools.Input.*;
public class EnergyConsumption {

	public static void main (String [] args)
	{
		int age = readInteger("Bitte Alter in Jahren eingeben:" );
		int mass = readInteger("Bitte Gewicht in Kilogramm eingeben:" );
		int height = readInteger("Bitte Größe in cm eingeben:" );
		boolean gender = readBoolean("Bitte true für Frau und false für Mann eingeben: ");
		String job = readLine("Bitte Beruf eingeben: ");
		int result = calculateConsumptionProfession(gender, age, height, mass, job);
		System.out.println("\n\nGesamtumsatz: " +(int)result + " kcal pro Tag");
	}
	public static int calculateConsumption(boolean gender, int age, int height, int mass, double factor)
	{
		
		double GMann = (10 * mass) + (6.25 * height) - (5 * age) + 5;
		double GFrau = (10 * mass) + (6.25 * height) - (5 * age) - 161;
		double Gtotal;
		
		if (gender == true)
		Gtotal = GFrau * factor;
		else
			Gtotal = GMann * factor;
	
		return (int)Gtotal;
	}
	
	public static int calculateConsumptionProfession(boolean gender, int age, int height, int mass, String job)
	{
		double factor = 0;
	
		switch (job)
		{
		case "Büroangestellte":
			factor = 1.45;
			break;
		case "Laborant", "Kraftfahrer":
			factor = 1.6;
			break;
		case "Fließbandarbeiter":
			factor = 1.65;
			break;
		case "Pflegepersonal", "Kellner", "Mechaniker", "Handwerker":
			factor = 1.8;
			break;
		case "Bauarbeiter", "Landwirt", "Waldarbeiter", "Bergarbeiter":
			factor = 2.0;
			break;
		case "Leistungssportler":
			factor = 2.4;
			break;
		default: 
			factor = 1.2;
			break;
		}
		 return calculateConsumption(gender, age, height, mass, factor);
	}
}

