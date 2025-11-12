package aufgabe2;
import static de.tha.prog.tools.Input.*;

public class DateHandler
{
	public DateHandler() { }
	
	public static boolean isLeapYear(int year)
	{
				
		if((year % 4 == 0) && (year % 100 !=0))
		{
			return true;
		}
			else if(year % 400 == 0)
			{
				return true;
			}
		
		else
		{
			return false;
		}
	
	}
	
	public int dateHandler ()
	{
		int year = readInteger("Geben Sie bitte das Jahr ein: ");
		return year;
	}
	
	public static void main(String [] args)
	{
		DateHandler check = new DateHandler();
		int year = check.dateHandler();
		boolean isLeapYr = isLeapYear(year);
		
		if (isLeapYr)
		{
		System.out.println(year +" ist ein Schaltjahr.");
		}
		else
		{
		System.out.println(year +" ist kein Schaltjahr.");
		}
	}
}
