package Aufgabe2;

import static de.tha.prog.tools.Input.*;

public class Decisions {
	public static void main(String[] args) {
		int num1;
		int num2;
		System.out.println("Aufgabe 2b\nDas Ergebnis der Berechnung lautet: " + substractNumbers(9, 2));
		System.out.println("\nAufgabe 2c\nOb die Kommazahl positive ist? "+isPositive(3.48f));
		System.out.println("\nAufgabe 2d\nNun schauen wir, ob das Produkt gerade ist: " +isProductEven(4,5));
		System.out.println("\nAufgabe 2e\nDie Flaeche des Kreises ist: " +calcCircleArea(5.78) +" quadrat Einheiten");
	}

	public static boolean isPositive(float f) {
		 boolean status=true;
		 if(f>0) {
		 return status;
		 }else status = false;
		 return status;
	}

	public static int substractNumbers(int num1, int num2) {

		int diff = num1 - num2;
		return diff;
	}
	
	public static boolean isProductEven(int a, int b)
	{
	// Stünden hier zugewiesene Werte für a und b, wären die übergebenen Parameter ignoriert. 
		int product = a*b;
		boolean verdict = true;
		if(product%2==0)
		{
			return verdict;
		}
		return false;
	}
	
	public static double calcCircleArea(double r)
	{
		double area = r*r*Math.PI;
		return area;
	}
}
