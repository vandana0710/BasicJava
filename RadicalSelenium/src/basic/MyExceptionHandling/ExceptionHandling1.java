package basic.MyExceptionHandling;

public class ExceptionHandling1
{
	public static void main(String args[])
	{
		System.out.println("starting of program");
		try
		{
			int i=10;
			int k=10/0;
			System.out.println("printing k = "+k);
		}
		catch(NullPointerException obj)
		{
			System.out.println("NPE : in catch");
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Arithematic: in catch");
		}
		catch(Exception e)
		{
			System.out.println("something went wrong");
		}
		finally
		{
			System.out.println("in finally : switch off everything");
		}
		
		System.out.println("Ending of program");
	}
}
