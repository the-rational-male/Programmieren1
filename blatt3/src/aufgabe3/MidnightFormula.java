package aufgabe3;
import static de.tha.prog.tools.Input.*;
import java.util.Locale;


public class MidnightFormula
{
	private static int a, b, c;
	public static String printFormula(int a, int b, int c)
	{
		String asign = (a < 0) ? "- " + Math.abs(a) : "" + a;
		String bsign = (b < 0) ? "- " + Math.abs(b) : (b==0 ? " " : "+" + " " + b);
		String csign = (c < 0) ? "- " + Math.abs(c) : (c==0 ? " " : "+" + " " + c);
		String out = String.format("\n%s*x^2 %s*x %s = 0", asign, bsign, csign);
		return out;
	}
	
	public static String calculateFormula(int a, int b, int c)
	{
		if(a==0 && b==0)
		{
			if(c != 0) 
			{
				return "\nEs gibt keine Lösung der Gleichung";
			}
			else
			{
				return "\nEs gibt unendlich viele Lösungen";
			}
		}
		
		int delta = (b*b) - (4*(a*c));
		double  root1 = ((-b) + (Math.sqrt(delta)))/(2.0 * a);			
		double  root2 = ((-b) - (Math.sqrt(delta)))/(2.0 * a);
				
		if(a==0)
		{
			double  ans = -c/(double)b;
					ans = (Math.round(ans * 100.0))/100.0;
				String x=String.format("\nDie Gleichung hat eine reelle Lösung: x1 = %.2f", ans);
				x = x.replace(',','.');
				return x;		
		}
		else
			root1 = (Math.round(root1 * 100.0))/100.0; 
			root2 = (Math.round(root2 * 100.0))/100.0;
		
		if(delta < 0)
		{
		
			String x = String.format("\nDie Gleichung hat keine reelle Lösung");
			return x;
			
		}
		else if(delta == 0)
		{
			double ans = -(double)b/(2.0 * a);
			ans = (Math.round(ans * 100.0))/100.0;
			String x=String.format("\nDie Gleichung hat eine reelle Lösung: x = %.1f", ans);
			x = x.replace(',','.');
			return x;		
		}
		else
		{
			double ans1 = root1;
			double ans2 = root2;
			String x = String.format("\nDie Gleichung hat zwei reelle Lösungen: x1 = %.2f x2 = %.2f", root1, root2);
			x = x.replace(',','.');
			return x;
		}
	}
	public static void main(String [] args)
	{
		a = readInteger("Geben Sie bitte den Wert von a ein: ");
		b = readInteger("Geben Sie bitte den Wert von b ein: ");
		c = readInteger("Geben Sie bitte den Wert von c ein: \n");
		
	System.out.print(printFormula(a,b,c));
	System.out.println(calculateFormula(a,b,c));
	
	}

}
