package aufgabe4;
import static de.tha.prog.tools.Input.*;

public class CashMachine {

	public static int cashOut(int amount)
	{
		amount = readInteger("Auszuzahlender Betrag: \n");
		int note500 = amount/500;
		amount = amount % 500;
		int note200 = amount/200;
		amount = amount % 200;
		int note100 = amount/100;
		amount = amount % 100;
		int note50 = amount/50;
		amount = amount % 50;
		int note20 = amount/20;
		amount = amount % 20;
		int note10 = amount/10;
		amount = amount % 10;
		int note5 = amount/5;
		amount = amount % 5;
	
		
		System.out.println("500-Euro Scheine:" + note500);
		System.out.println("200-Euro Scheine:" + note200);
		System.out.println("100-Euro Scheine:" + note100);
		System.out.println("50-Euro Scheine:" + note50);
		System.out.println("20-Euro Scheine:" + note20);
		System.out.println("10-Euro Scheine:" + note10);
		System.out.println("5-Euro Scheine:" + note5);
		System.out.println("Rest: " + amount);
		
		return 0;
	}
	
	public static void main(String [] args)
	{
		cashOut(475);
	}
	
	
}
