package exceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Program Started...");
			int data = 100/0; // Unchecked - ArithmeticException
			String s = null; 
			System.out.println(s.length()); // Unchecked - NullPointerException
			String x = "abc";
			int i=Integer.parseInt(x); // Unchecked - NumberFormatException
			
		}

		// Catch the exception

		catch(Exception e)
		{
			System.out.println("Something went wrong"+e);

		}
		// rest program will be executed
		System.out.println("Code after exception occurred...");

	}

}
