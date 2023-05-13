package exceptionHandling;

public class TestThrow {

	public static void main(String[] args) {
		
		int age = 50;
		
		if (age < 18) {
			
			

			// The throw statement allows you to create a custom error.

			//The throw statement is used together with an exception type. 
			// if we get an exception , in try catch it stores executes the rest of pgm
			// with throw,it shows error to user,and do nothing  else
			
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
			
		     }
		else 
		{
			
			System.out.println("Access granted - You are old enough!");
		}
	}
}


