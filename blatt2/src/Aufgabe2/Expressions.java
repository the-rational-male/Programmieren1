package Aufgabe2;
import static de.tha.prog.tools.Input.*;
;
public class Expressions {
	private int a = 4, b = 3, c = 10;
	private boolean d = true;
	private float f1 = 2.0f;
	
	public Expressions() {}
	
	public Expressions(int a, int b, int c, boolean d, float f1) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.f1 = f1;
	}
	
	public int expressionA() {
		// Teilaufgabe a)
			return b = c = a >> 1;
	}
	
	public int expressionB() {
		// Teilaufgabe b)
			a = 10;
			return b = c = a << 2;
	}
	
	public boolean expressionC() {
		// Teilaufgabe c)
			if((a %2==0) &&(c%2 == 0))
				{
				return d;
				}
			else return !d;
	}
	
	public boolean expressionD() {
		// Teilaufgabe d)
			return	 ((a  = (int)f1) >=0) &(d&&(f1>10));
	}
	
	public boolean expressionE() {
		// Teilaufgabe e)/*
		    return ((b & 0b110) == 0b110);
		}

	
	public void expressionF() {
		// Teilaufgabe f)
	 f1 = ((a%10==0 && b%10==0) ? (a/3.0f) : (10*a));
	}
	
	public String toString() {
		return "a = " + a + " b = " + b + " c = " + c + " d = " + d + " f1 = " + f1;
	}
	
	public static void main(String[] args) {
		Expressions expression = new Expressions();
		System.out.println("Wert der Attribute vor dem Aufruf der expression-Methode: " + expression.toString());
		
		// Kommentieren sie jeweils den Aufruf der Methode ein, um ihre Methode und die Auswirkungen ihrer Methode zu testen
		// Stellen sie sicher, dass nur ein Methoden-Aufruf aktiv ist, da diese unter Umständen Seiteneffekte haben können
		//expression.expressionA();   // Testet Teilaufgabe a)
	//	expression.expressionB(); // Testet Teilaufgabe b)
		//expression.expressionC(); // Testet Teilaufgabe c)
		//expression.expressionD(); // Testet Teilaufgabe d)
		//expression.expressionE(); // Testet Teilaufgabe e)
		//expression.expressionF(); // Testet Teilaufgabe f)
		System.out.println("Wert der Attribute nach dem Aufruf der expression-Methode: " + expression.toString());
	}
}
