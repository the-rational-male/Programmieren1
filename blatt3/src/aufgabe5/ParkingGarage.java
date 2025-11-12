package aufgabe5;
import static de.tha.prog.tools.Input.*;


public class ParkingGarage {
	/**
	 * mit system.err.println "printet" man eine Fehlermeldung auf der Konsole. Das return verstärkt dies, dadurch, dass das Program gleich beendet wird.
	 * @param args
	 */
	
	public static void main(String [] args)
	{
		int duration = readInteger("Wie lange bleiben Sie hier?: ");
		if(duration <= 0)
		{
			System.err.println("Program wegen ungültiger Eingabe abgebrochen. Bitte neustarten!\n");
			return;
		}
		else
			System.out.println("Berechnung: \n\n"+"Nach 1 Stunde: "+1.75f+" Euro");		//{} weg, weil sowieso nur eine Befehlszeile zum else block gehört.
		for(int i=1; i<duration; i++)
		{
			System.out.println("Nach"+" "+(i+1)+" Stunden: "+((i+1) * 1.75f)+" Euro");	//i+1 weil eine erste Schleifendurchlauf bereits stattgefunden hat.
																						//mit int i=2, wäre der output nur jedes 2. Mal ausgedruckt, statt solange i<10
		}
		System.out.println("\nGesamtkosten: "+(1.75f * duration));
	}

}
