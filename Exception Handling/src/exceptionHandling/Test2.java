// Task : Implement throw, throws and Custom Exception

package exceptionHandling;

class NegativeDimensionException extends Exception //making custom exception
{
	public  String toString()
	{
		return "Dimensions cannot be negative";
	}
	public String getMessage()
	{
		return "Dimensions cannot be negative";
	}
}

public class Test2 {
	public static void main(String args[])
	{
		// exception handling
		try {
		int area = getArea(-5,5);
		System.out.println(area);
		}
		catch(NegativeDimensionException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	// throw and throws for custom exception
	public static int getArea(int length, int breadth) throws NegativeDimensionException
	{
		if(length < 0 || breadth < 0)
		{
			throw new NegativeDimensionException();
		}
		return length*breadth;
	}
}
