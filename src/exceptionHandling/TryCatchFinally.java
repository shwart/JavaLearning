package exceptionHandling;

//If a statement in try block raised an exception, then the rest of the try block doesn’t execute
//control passes to the corresponding catch block. 
//After executing the catch block, the control will be transferred to finally block(if present) and 
//then the rest program will be executed. 

public class TryCatchFinally {

	public static void main(String[] args) {

		int[] arr = new int[4];

		try
		{
			System.out.println("Program Started...");
			int i = arr[5];

			// this statement will never execute
			// as exception is raised by above statement
			System.out.println("Inside try block");
		}

		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Exception caught in catch block");
		}

		// finally will execute if there is an exception occurs/not occurs
		// not mandatory
		
		finally
		{
			System.out.println("finally block executed");
		}

		// rest program will be executed
		System.out.println("Outside try-catch-finally clause");
	}
}


