package aufgabe1;

public class NumberSort
{
	private int small, medium, big;
	
	public NumberSort(int a, int b, int c)
	{
		// TODO: Ihr code hier
		if((a<=b) && (a<=c))
		{
			small   = a;
			if(b<=c)
			{
				medium  = b;
				big		= c;
			}
			else
			{
				big =b;
				medium = c;
			}
		}
		else if((b<=a)&&(b<=c))
		{
			small = b;
			if(a<=c)
			{
				medium  = a;
				big		= c;
			}
			else
			{
				big = a;
				medium = c;
			}
		}
		else 
		{
			small = c;
			if(a<=b)
			{
				medium  = a;
				big		= b;
			}
		else
		{
			medium  = b;
			big		= a;
		}
		}
		

	}
	
	public int getSmall()
	{ 
		return small;
	}
	
	public int getMedium()
	{
		return medium;
	}
	
	public int getBig()
	{
		return big;
	}
	
}
