package aufgabe4;
import static de.tha.prog.tools.Input.*;

public class CashMaschine
{
	private static int amount;
	public static int getMoney(int amount)
	{
		amount = readInteger("Bitte den Wunschbetrag eingeben: ");
		Money money = new Money();
		money.bills500 = amount/500;
		amount 		   = amount%500;
		money.bills200 = amount/200;
		amount		   = amount%200;
		money.bills100 = amount/100;
		amount		   = amount%100;
		money.bills50  = amount/50;
		amount	  	   = amount%50;
		money.bills20  = amount/20;
		amount 		   = amount%20;
		money.bills10  = amount/10;
		amount		   = amount%10;
		money.bills5   = amount/5;
		amount		   = amount%5;
		money.remainder= amount;
		return amount;
		
	}
	public static void main(String[] args)
	{
	
	}

}
